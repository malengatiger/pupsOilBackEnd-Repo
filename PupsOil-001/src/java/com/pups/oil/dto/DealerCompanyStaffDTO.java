/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto;

import com.pups.oil.data.DealerCompanyStaff;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class DealerCompanyStaffDTO implements Serializable {
    private static final long serialVersionUID = 1L;
     private Integer dealerCompanyStaffID;
    private String firstName;
     private String lastName;
     private String cellphone;
     private long dateRegistered;
     private int activeFlag;
     private int gender;
    private String iDNumber;
     private Integer dealerCompanyID;

    public DealerCompanyStaffDTO() {
    }

    public DealerCompanyStaffDTO(Integer dealerCompanyStaffID) {
        this.dealerCompanyStaffID = dealerCompanyStaffID;
    }

    public DealerCompanyStaffDTO(DealerCompanyStaff a) {
        this.dealerCompanyStaffID = a.getDealerCompanyStaffID();
        this.firstName = a.getFirstName();
        this.lastName = a.getLastName();
        this.cellphone = a.getCellphone();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        this.gender = a.getGender();
        iDNumber = a.getiDNumber();
        dealerCompanyID = a.getDealerCompany().getDealerCompanyID();
    }

    public Integer getDealerCompanyStaffID() {
        return dealerCompanyStaffID;
    }

    public void setDealerCompanyStaffID(Integer dealerCompanyStaffID) {
        this.dealerCompanyStaffID = dealerCompanyStaffID;
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

    public Integer getDealerCompanyID() {
        return dealerCompanyID;
    }

    public void setDealerCompanyID(Integer dealerCompanyID) {
        this.dealerCompanyID = dealerCompanyID;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerCompanyStaffID != null ? dealerCompanyStaffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DealerCompanyStaffDTO)) {
            return false;
        }
        DealerCompanyStaffDTO other = (DealerCompanyStaffDTO) object;
        if ((this.dealerCompanyStaffID == null && other.dealerCompanyStaffID != null) || (this.dealerCompanyStaffID != null && !this.dealerCompanyStaffID.equals(other.dealerCompanyStaffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DealerCompanyStaff[ dealerCompanyStaffID=" + dealerCompanyStaffID + " ]";
    }
    
}
