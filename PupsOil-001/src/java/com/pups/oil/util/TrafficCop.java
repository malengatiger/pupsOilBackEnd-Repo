/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.util;

import com.pups.oil.dto.transfer.RequestDTO;
import com.pups.oil.dto.transfer.ResponseDTO;

/**
 *
 * @author aubreyM
 */
public class TrafficCop {
    
    public static ResponseDTO processRequest(RequestDTO req, DataUtil dataUtil)throws DataException {
        ResponseDTO r = new ResponseDTO();
        switch(req.getRequestType()) {
            case RequestDTO.REGISTER_DEALER_COMPANY:
                r = dataUtil.registerDealerCompany(req.getDealerCompany(), req.getDealerCompanyStaff());
                break;
        }       
        return r;
    }
}
