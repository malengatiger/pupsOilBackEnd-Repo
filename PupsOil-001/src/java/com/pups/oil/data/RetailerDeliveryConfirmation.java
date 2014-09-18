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

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "RetailerDeliveryConfirmation.findAll", query = "SELECT r FROM RetailerDeliveryConfirmation r"),
    @NamedQuery(name = "RetailerDeliveryConfirmation.findByRetailerDeliveryConfirmationID", query = "SELECT r FROM RetailerDeliveryConfirmation r WHERE r.retailerDeliveryConfirmationID = :retailerDeliveryConfirmationID"),
    @NamedQuery(name = "RetailerDeliveryConfirmation.findByDeliveryDate", query = "SELECT r FROM RetailerDeliveryConfirmation r WHERE r.deliveryDate = :deliveryDate"),
    @NamedQuery(name = "RetailerDeliveryConfirmation.findByQuantity", query = "SELECT r FROM RetailerDeliveryConfirmation r WHERE r.quantity = :quantity"),
    @NamedQuery(name = "RetailerDeliveryConfirmation.findByConditionFlag", query = "SELECT r FROM RetailerDeliveryConfirmation r WHERE r.conditionFlag = :conditionFlag")})
public class RetailerDeliveryConfirmation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer retailerDeliveryConfirmationID;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @Basic(optional = false)
    @NotNull
    private int quantity;
    @Basic(optional = false)
    @NotNull
    private int conditionFlag;
    @JoinColumn(name = "retailerStaffID", referencedColumnName = "retailerStaffID")
    @ManyToOne(optional = false)
    private RetailerStaff retailerStaff;
    @JoinColumn(name = "retailerPurchaseOrderID", referencedColumnName = "retailerPurchaseOrderID")
    @ManyToOne(optional = false)
    private RetailerPurchaseOrder retailerPurchaseOrder;

    public RetailerDeliveryConfirmation() {
    }

    public RetailerDeliveryConfirmation(Integer retailerDeliveryConfirmationID) {
        this.retailerDeliveryConfirmationID = retailerDeliveryConfirmationID;
    }

    public RetailerDeliveryConfirmation(Integer retailerDeliveryConfirmationID, Date deliveryDate, int quantity, int conditionFlag) {
        this.retailerDeliveryConfirmationID = retailerDeliveryConfirmationID;
        this.deliveryDate = deliveryDate;
        this.quantity = quantity;
        this.conditionFlag = conditionFlag;
    }

    public Integer getRetailerDeliveryConfirmationID() {
        return retailerDeliveryConfirmationID;
    }

    public void setRetailerDeliveryConfirmationID(Integer retailerDeliveryConfirmationID) {
        this.retailerDeliveryConfirmationID = retailerDeliveryConfirmationID;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getConditionFlag() {
        return conditionFlag;
    }

    public void setConditionFlag(int conditionFlag) {
        this.conditionFlag = conditionFlag;
    }

    public RetailerStaff getRetailerStaff() {
        return retailerStaff;
    }

    public void setRetailerStaff(RetailerStaff retailerStaff) {
        this.retailerStaff = retailerStaff;
    }

    public RetailerPurchaseOrder getRetailerPurchaseOrder() {
        return retailerPurchaseOrder;
    }

    public void setRetailerPurchaseOrder(RetailerPurchaseOrder retailerPurchaseOrder) {
        this.retailerPurchaseOrder = retailerPurchaseOrder;
    }

 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerDeliveryConfirmationID != null ? retailerDeliveryConfirmationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerDeliveryConfirmation)) {
            return false;
        }
        RetailerDeliveryConfirmation other = (RetailerDeliveryConfirmation) object;
        if ((this.retailerDeliveryConfirmationID == null && other.retailerDeliveryConfirmationID != null) || (this.retailerDeliveryConfirmationID != null && !this.retailerDeliveryConfirmationID.equals(other.retailerDeliveryConfirmationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.RetailerDeliveryConfirmation[ retailerDeliveryConfirmationID=" + retailerDeliveryConfirmationID + " ]";
    }
    
}
