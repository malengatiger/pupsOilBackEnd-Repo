/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.RetailerStaff;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class RetailerStaffDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer retailerStaffID;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private long dateRegistered;
    private int activeFlag;
    private Integer gender;
    private String iDNumber;
    private Integer retailerID;
    private List<RetailerDeliveryConfirmationDTO> retailerDeliveryConfirmationList;

    public RetailerStaffDTO() {
    }

    public RetailerStaffDTO(Integer retailerStaffID) {
        this.retailerStaffID = retailerStaffID;
    }

    public RetailerStaffDTO(RetailerStaff a) {
        this.retailerStaffID = a.getRetailerStaffID();
        this.firstName = a.getFirstName();
        this.lastName = a.getLastName();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        this.gender = a.getGender();
        this.iDNumber = a.getIDNumber();
        this.retailerID = a.getRetailer().getRetailerID();
    }

    public Integer getRetailerStaffID() {
        return retailerStaffID;
    }

    public void setRetailerStaffID(Integer retailerStaffID) {
        this.retailerStaffID = retailerStaffID;
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Integer getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public List<RetailerDeliveryConfirmationDTO> getRetailerDeliveryConfirmationList() {
        return retailerDeliveryConfirmationList;
    }

    public void setRetailerDeliveryConfirmationList(List<RetailerDeliveryConfirmationDTO> retailerDeliveryConfirmationList) {
        this.retailerDeliveryConfirmationList = retailerDeliveryConfirmationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerStaffID != null ? retailerStaffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerStaffDTO)) {
            return false;
        }
        RetailerStaffDTO other = (RetailerStaffDTO) object;
        if ((this.retailerStaffID == null && other.retailerStaffID != null) || (this.retailerStaffID != null && !this.retailerStaffID.equals(other.retailerStaffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.RetailerStaff[ retailerStaffID=" + retailerStaffID + " ]";
    }

}
