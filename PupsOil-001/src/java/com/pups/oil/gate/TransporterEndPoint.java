/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.gate;

import com.google.gson.Gson;
import com.pups.oil.dto.transfer.RequestDTO;
import com.pups.oil.dto.transfer.ResponseDTO;
import com.pups.oil.util.DataException;
import com.pups.oil.util.DataUtil;
import com.pups.oil.util.GZipUtility;
import com.pups.oil.util.TrafficCop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author aubreyM
 */
@ServerEndpoint("/transporter")
@Stateful
public class TransporterEndPoint {

    @EJB
    DataUtil dataUtil;
    static final String SOURCE = "TransporterWebSocket";
    //TODO - clean up expired sessions!!!!
    public static final Set<Session> peers
            = Collections.synchronizedSet(new HashSet<Session>());

    @OnMessage
    public ByteBuffer onMessage(String message) {
        log.log(Level.WARNING, "onMessage: {0}", message);
        ResponseDTO resp = new ResponseDTO();
        try {
            RequestDTO dto = gson.fromJson(message, RequestDTO.class);
            resp = TrafficCop.processRequest(dto, dataUtil);

        } catch (DataException e) {
            resp.setStatusCode(101);
            resp.setMessage("Data service failed to process your request");
            log.log(Level.SEVERE, "Database related failure", e);
        }
        ByteBuffer bb = null;
        try {
            bb = getZippedResponse(resp);
        } catch (Exception ex) {
            log.log(Level.SEVERE, null, ex);
        }
        return bb;
    }

    @OnOpen
    public void onOpen(Session session) {

        peers.add(session);
        try {
            ResponseDTO r = new ResponseDTO();
            r.setSessionID(session.getId());
            session.getBasicRemote().sendText(gson.toJson(r));
            log.log(Level.WARNING, "onOpen...sent session id: {0}", session.getId());
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Failed to send websocket sessionID", ex);
        }
    }

    @OnClose
    public void onClose(Session session
    ) {
        log.log(Level.WARNING, "onClose - remove session: {0}", session.getId());
        for (Session m : peers) {
            if (session.getId().equalsIgnoreCase(m.getId())) {
                peers.remove(m);
                break;
            }
        }
    }

    @OnError
    public void onError(Throwable t) {
        log.log(Level.SEVERE, null, t);

    }

    private ByteBuffer getZippedResponse(ResponseDTO resp)
            throws Exception {
        File file = GZipUtility.getZipped(gson.toJson(resp));
        byte[] bFile = new byte[(int) file.length()];
        FileInputStream fileInputStream = null;

        //convert file into array of bytes
        fileInputStream = new FileInputStream(file);
        fileInputStream.read(bFile);
        fileInputStream.close();
        ByteBuffer buf = ByteBuffer.wrap(bFile);
        return buf;
    }
    Gson gson = new Gson();
    static final Logger log = Logger.getLogger(TransporterEndPoint.class.getSimpleName());
}
