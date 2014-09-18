/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
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
public class RetailerDeliveryConfirmationDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer retailerDeliveryConfirmationID;
    private long deliveryDate;
    private int quantity;
    private int conditionFlag;
    private RetailerStaffDTO retailerStaff;
    private RetailerPurchaseOrderDTO retailerPurchaseOrder;

    public RetailerDeliveryConfirmationDTO() {
    }

    public RetailerDeliveryConfirmationDTO(Integer retailerDeliveryConfirmationID) {
        this.retailerDeliveryConfirmationID = retailerDeliveryConfirmationID;
    }

    public RetailerDeliveryConfirmationDTO(RetailerDeliveryConfirmation a) {
        this.retailerDeliveryConfirmationID = a.getRetailerDeliveryConfirmationID();
        this.deliveryDate = a.getDeliveryDate().getTime();
        this.quantity = a.getQuantity();
        this.conditionFlag = a.getConditionFlag();
        this.retailerStaff = new RetailerStaffDTO(a.getRetailerStaff());
    }

    public Integer getRetailerDeliveryConfirmationID() {
        return retailerDeliveryConfirmationID;
    }

    public void setRetailerDeliveryConfirmationID(Integer retailerDeliveryConfirmationID) {
        this.retailerDeliveryConfirmationID = retailerDeliveryConfirmationID;
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

    public RetailerStaffDTO getRetailerStaff() {
        return retailerStaff;
    }

    public void setRetailerStaff(RetailerStaffDTO retailerStaff) {
        this.retailerStaff = retailerStaff;
    }

    public RetailerPurchaseOrderDTO getRetailerPurchaseOrder() {
        return retailerPurchaseOrder;
    }

    public void setRetailerPurchaseOrder(RetailerPurchaseOrderDTO retailerPurchaseOrder) {
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
        if (!(object instanceof RetailerDeliveryConfirmationDTO)) {
            return false;
        }
        RetailerDeliveryConfirmationDTO other = (RetailerDeliveryConfirmationDTO) object;
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
