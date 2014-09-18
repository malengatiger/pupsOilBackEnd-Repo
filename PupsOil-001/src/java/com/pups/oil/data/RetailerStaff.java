/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "RetailerStaff.findAll", query = "SELECT r FROM RetailerStaff r"),
    @NamedQuery(name = "RetailerStaff.findByRetailerStaffID", query = "SELECT r FROM RetailerStaff r WHERE r.retailerStaffID = :retailerStaffID"),
    @NamedQuery(name = "RetailerStaff.findByFirstName", query = "SELECT r FROM RetailerStaff r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "RetailerStaff.findByLastName", query = "SELECT r FROM RetailerStaff r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "RetailerStaff.findByCellphone", query = "SELECT r FROM RetailerStaff r WHERE r.cellphone = :cellphone"),
    @NamedQuery(name = "RetailerStaff.findByEmail", query = "SELECT r FROM RetailerStaff r WHERE r.email = :email"),
    @NamedQuery(name = "RetailerStaff.findByDateRegistered", query = "SELECT r FROM RetailerStaff r WHERE r.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "RetailerStaff.findByActiveFlag", query = "SELECT r FROM RetailerStaff r WHERE r.activeFlag = :activeFlag"),
    @NamedQuery(name = "RetailerStaff.findByGender", query = "SELECT r FROM RetailerStaff r WHERE r.gender = :gender"),
    @NamedQuery(name = "RetailerStaff.findByIDNumber", query = "SELECT r FROM RetailerStaff r WHERE r.iDNumber = :iDNumber")})
public class RetailerStaff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer retailerStaffID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String lastName;
    @Size(max = 45)
    private String cellphone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    private Integer gender;
    @Size(max = 45)
    private String iDNumber;
    @JoinColumn(name = "retailerID", referencedColumnName = "retailerID")
    @ManyToOne(optional = false)
    private Retailer retailer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerStaff")
    private List<RetailerDeliveryConfirmation> retailerDeliveryConfirmationList;

    public RetailerStaff() {
    }

    public RetailerStaff(Integer retailerStaffID) {
        this.retailerStaffID = retailerStaffID;
    }

    public RetailerStaff(Integer retailerStaffID, String firstName, String lastName, String email, Date dateRegistered, int activeFlag) {
        this.retailerStaffID = retailerStaffID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
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


    public List<RetailerDeliveryConfirmation> getRetailerDeliveryConfirmationList() {
        return retailerDeliveryConfirmationList;
    }

    public void setRetailerDeliveryConfirmationList(List<RetailerDeliveryConfirmation> retailerDeliveryConfirmationList) {
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
        if (!(object instanceof RetailerStaff)) {
            return false;
        }
        RetailerStaff other = (RetailerStaff) object;
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
