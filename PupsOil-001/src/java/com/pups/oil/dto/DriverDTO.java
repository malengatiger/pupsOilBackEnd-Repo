/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.Driver;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class DriverDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer driverID;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private long dateRegistered;
    private int activeFlag;
    private int gender;
    private String iDNumber;
    private Integer transporterCompanyID;
    private List<DriverTrackerDTO> driverTrackerList;
    private List<OrderScheduleDTO> orderScheduleList;
    private List<DriverLogRecordDTO> driverLogRecordList;

    public DriverDTO() {
    }

    public DriverDTO(Integer driverID) {
        this.driverID = driverID;
    }

    public DriverDTO(Driver a) {
        this.driverID = a.getDriverID();
        this.firstName = a.getFirstName();
        this.lastName = a.getLastName();
        this.cellphone = a.getCellphone();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        this.gender = a.getGender();
        this.iDNumber = a.getiDNumber();
        this.transporterCompanyID = a.getTransporterCompany().getTransporterCompanyID();
    }

    public Integer getDriverID() {
        return driverID;
    }

    public void setDriverID(Integer driverID) {
        this.driverID = driverID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getTransporterCompanyID() {
        return transporterCompanyID;
    }

    public void setTransporterCompanyID(Integer transporterCompanyID) {
        this.transporterCompanyID = transporterCompanyID;
    }


    public List<DriverTrackerDTO> getDriverTrackerList() {
        return driverTrackerList;
    }

    public void setDriverTrackerList(List<DriverTrackerDTO> driverTrackerList) {
        this.driverTrackerList = driverTrackerList;
    }

    public List<OrderScheduleDTO> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderScheduleDTO> orderScheduleList) {
        this.orderScheduleList = orderScheduleList;
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
        hash += (driverID != null ? driverID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverDTO)) {
            return false;
        }
        DriverDTO other = (DriverDTO) object;
        if ((this.driverID == null && other.driverID != null) || (this.driverID != null && !this.driverID.equals(other.driverID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Driver[ driverID=" + driverID + " ]";
    }

}
