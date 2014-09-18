/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
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
public class RetailerPurchaseOrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer retailerPurchaseOrderID;
    private long dateCreated;
    private long dateApproved;
    private String purchaseOrderNumber;
    private String remarks;
    private List<PurchaseOrderLineItemDTO> purchaseOrderLineItemList;
    private DealerCompanyDTO dealerCompany;
    private RetailerDTO retailer;
    private List<RetailerDeliveryConfirmationDTO> retailerDeliveryConfirmationList;

    public RetailerPurchaseOrderDTO() {
    }

    public RetailerPurchaseOrderDTO(Integer retailerPurchaseOrderID) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
    }

    public RetailerPurchaseOrderDTO(RetailerPurchaseOrder a) {
        this.retailerPurchaseOrderID = a.getRetailerPurchaseOrderID();
        this.dateCreated = a.getDateCreated().getTime();
        if (a.getDateApproved() != null) {
            dateApproved = a.getDateApproved().getTime();
        }
        this.purchaseOrderNumber = a.getPurchaseOrderNumber();
        this.remarks = a.getRemarks();
        this.dealerCompany = new DealerCompanyDTO(a.getDealerCompany());
        this.retailer = new RetailerDTO(a.getRetailer());
    }

    public Integer getRetailerPurchaseOrderID() {
        return retailerPurchaseOrderID;
    }

    public void setRetailerPurchaseOrderID(Integer retailerPurchaseOrderID) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(long dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<PurchaseOrderLineItemDTO> getPurchaseOrderLineItemList() {
        return purchaseOrderLineItemList;
    }

    public void setPurchaseOrderLineItemList(List<PurchaseOrderLineItemDTO> purchaseOrderLineItemList) {
        this.purchaseOrderLineItemList = purchaseOrderLineItemList;
    }

    public DealerCompanyDTO getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompanyDTO dealerCompany) {
        this.dealerCompany = dealerCompany;
    }

    public RetailerDTO getRetailer() {
        return retailer;
    }

    public void setRetailer(RetailerDTO retailer) {
        this.retailer = retailer;
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
        hash += (retailerPurchaseOrderID != null ? retailerPurchaseOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerPurchaseOrderDTO)) {
            return false;
        }
        RetailerPurchaseOrderDTO other = (RetailerPurchaseOrderDTO) object;
        if ((this.retailerPurchaseOrderID == null && other.retailerPurchaseOrderID != null) || (this.retailerPurchaseOrderID != null && !this.retailerPurchaseOrderID.equals(other.retailerPurchaseOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.RetailerPurchaseOrder[ retailerPurchaseOrderID=" + retailerPurchaseOrderID + " ]";
    }

}
