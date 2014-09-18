/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "DealerCompanyStaff.findAll", query = "SELECT d FROM DealerCompanyStaff d"),
    @NamedQuery(name = "DealerCompanyStaff.findByDealerCompanyStaffID", query = "SELECT d FROM DealerCompanyStaff d WHERE d.dealerCompanyStaffID = :dealerCompanyStaffID"),
    @NamedQuery(name = "DealerCompanyStaff.findByFirstName", query = "SELECT d FROM DealerCompanyStaff d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "DealerCompanyStaff.findByLastName", query = "SELECT d FROM DealerCompanyStaff d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "DealerCompanyStaff.findByCellphone", query = "SELECT d FROM DealerCompanyStaff d WHERE d.cellphone = :cellphone"),
    @NamedQuery(name = "DealerCompanyStaff.findByDateRegistered", query = "SELECT d FROM DealerCompanyStaff d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "DealerCompanyStaff.findByActiveFlag", query = "SELECT d FROM DealerCompanyStaff d WHERE d.activeFlag = :activeFlag"),
    @NamedQuery(name = "DealerCompanyStaff.findByGender", query = "SELECT d FROM DealerCompanyStaff d WHERE d.gender = :gender"),
    @NamedQuery(name = "DealerCompanyStaff.findByIDNumber", query = "SELECT d FROM DealerCompanyStaff d WHERE d.iDNumber = :iDNumber")})
public class DealerCompanyStaff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer dealerCompanyStaffID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String cellphone;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    @Basic(optional = false)
    @NotNull
    private int gender;
    @Size(max = 45)
    private String iDNumber;
    @JoinColumn(name = "dealerCompanyID", referencedColumnName = "dealerCompanyID")
    @ManyToOne(optional = false)
    private DealerCompany dealerCompany;

    public DealerCompanyStaff() {
    }

    public DealerCompanyStaff(Integer dealerCompanyStaffID) {
        this.dealerCompanyStaffID = dealerCompanyStaffID;
    }

    public DealerCompanyStaff(Integer dealerCompanyStaffID, String firstName, String lastName, String cellphone, Date dateRegistered, int activeFlag, int gender) {
        this.dealerCompanyStaffID = dealerCompanyStaffID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
        this.gender = gender;
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

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
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

    public DealerCompany getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompany dealerCompany) {
        this.dealerCompany = dealerCompany;
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
        if (!(object instanceof DealerCompanyStaff)) {
            return false;
        }
        DealerCompanyStaff other = (DealerCompanyStaff) object;
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
