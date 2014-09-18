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
    @NamedQuery(name = "RetailerPurchaseOrder.findAll", query = "SELECT r FROM RetailerPurchaseOrder r"),
    @NamedQuery(name = "RetailerPurchaseOrder.findByRetailerPurchaseOrderID", query = "SELECT r FROM RetailerPurchaseOrder r WHERE r.retailerPurchaseOrderID = :retailerPurchaseOrderID"),
    @NamedQuery(name = "RetailerPurchaseOrder.findByDateCreated", query = "SELECT r FROM RetailerPurchaseOrder r WHERE r.dateCreated = :dateCreated"),
    @NamedQuery(name = "RetailerPurchaseOrder.findByDateApproved", query = "SELECT r FROM RetailerPurchaseOrder r WHERE r.dateApproved = :dateApproved"),
    @NamedQuery(name = "RetailerPurchaseOrder.findByPurchaseOrderNumber", query = "SELECT r FROM RetailerPurchaseOrder r WHERE r.purchaseOrderNumber = :purchaseOrderNumber"),
    @NamedQuery(name = "RetailerPurchaseOrder.findByRemarks", query = "SELECT r FROM RetailerPurchaseOrder r WHERE r.remarks = :remarks")})
public class RetailerPurchaseOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer retailerPurchaseOrderID;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApproved;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String purchaseOrderNumber;
    @Size(max = 255)
    private String remarks;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerPurchaseOrder")
    private List<PurchaseOrderLineItem> purchaseOrderLineItemList;
    @JoinColumn(name = "dealerCompanyID", referencedColumnName = "dealerCompanyID")
    @ManyToOne(optional = false)
    private DealerCompany dealerCompany;
    @JoinColumn(name = "retailerID", referencedColumnName = "retailerID")
    @ManyToOne(optional = false)
    private Retailer retailer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerPurchaseOrder")
    private List<RetailerDeliveryConfirmation> retailerDeliveryConfirmationList;

    public RetailerPurchaseOrder() {
    }

    public RetailerPurchaseOrder(Integer retailerPurchaseOrderID) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
    }

    public RetailerPurchaseOrder(Integer retailerPurchaseOrderID, Date dateCreated, String purchaseOrderNumber) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
        this.dateCreated = dateCreated;
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Integer getRetailerPurchaseOrderID() {
        return retailerPurchaseOrderID;
    }

    public void setRetailerPurchaseOrderID(Integer retailerPurchaseOrderID) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
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

    public List<PurchaseOrderLineItem> getPurchaseOrderLineItemList() {
        return purchaseOrderLineItemList;
    }

    public void setPurchaseOrderLineItemList(List<PurchaseOrderLineItem> purchaseOrderLineItemList) {
        this.purchaseOrderLineItemList = purchaseOrderLineItemList;
    }

    public DealerCompany getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompany dealerCompany) {
        this.dealerCompany = dealerCompany;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
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
        hash += (retailerPurchaseOrderID != null ? retailerPurchaseOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerPurchaseOrder)) {
            return false;
        }
        RetailerPurchaseOrder other = (RetailerPurchaseOrder) object;
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
