/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class TankerDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer tankerID;
    private String tankerMake;
    private String tankerModel;
    private String registrationNumber;
    private String roadworthyCertificate;

    private Integer transporterCompanyID;
    private List<DriverLogRecordDTO> driverLogRecordList;

    public TankerDTO() {
    }

    public TankerDTO(Tanker a) {
        tankerID = a.getTankerID();
        tankerMake = a.getTankerMake();
        tankerModel = a.getTankerModel();
        registrationNumber = a.getRegistrationNumber();
        roadworthyCertificate = a.getRoadworthyCertificate();
    }

    public Integer getTankerID() {
        return tankerID;
    }

    public void setTankerID(Integer tankerID) {
        this.tankerID = tankerID;
    }

    public String getTankerMake() {
        return tankerMake;
    }

    public void setTankerMake(String tankerMake) {
        this.tankerMake = tankerMake;
    }

    public String getTankerModel() {
        return tankerModel;
    }

    public void setTankerModel(String tankerModel) {
        this.tankerModel = tankerModel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRoadworthyCertificate() {
        return roadworthyCertificate;
    }

    public void setRoadworthyCertificate(String roadworthyCertificate) {
        this.roadworthyCertificate = roadworthyCertificate;
    }

    public Integer getTransporterCompanyID() {
        return transporterCompanyID;
    }

    public void setTransporterCompanyID(Integer transporterCompanyID) {
        this.transporterCompanyID = transporterCompanyID;
    }

    public List<DriverLogRecordDTO> getDriverLogRecordList() {
        return driverLogRecordList;
    }

    public void setDriverLogRecordList(List<DriverLogRecordDTO> driverLogRecordList) {
        this.driverLogRecordList = driverLogRecordList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tankerID != null ? tankerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TankerDTO)) {
            return false;
        }
        TankerDTO other = (TankerDTO) object;
        if ((this.tankerID == null && other.tankerID != null) || (this.tankerID != null && !this.tankerID.equals(other.tankerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Tanker[ tankerID=" + tankerID + " ]";
    }

}
