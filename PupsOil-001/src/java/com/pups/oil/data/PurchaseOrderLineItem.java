/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "PurchaseOrderLineItem.findAll", query = "SELECT p FROM PurchaseOrderLineItem p"),
    @NamedQuery(name = "PurchaseOrderLineItem.findByPurchaseOrderLineItemID", query = "SELECT p FROM PurchaseOrderLineItem p WHERE p.purchaseOrderLineItemID = :purchaseOrderLineItemID"),
    @NamedQuery(name = "PurchaseOrderLineItem.findByQuantity", query = "SELECT p FROM PurchaseOrderLineItem p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "PurchaseOrderLineItem.findByCost", query = "SELECT p FROM PurchaseOrderLineItem p WHERE p.cost = :cost")})
public class PurchaseOrderLineItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer purchaseOrderLineItemID;
    @Basic(optional = false)
    @NotNull
    private int quantity;
    @Basic(optional = false)
    @NotNull
    private int cost;
    @JoinColumn(name = "productID", referencedColumnName = "productID")
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "retailerPurchaseOrderID", referencedColumnName = "retailerPurchaseOrderID")
    @ManyToOne(optional = false)
    private RetailerPurchaseOrder retailerPurchaseOrder;

    public PurchaseOrderLineItem() {
    }

    public PurchaseOrderLineItem(Integer purchaseOrderLineItemID) {
        this.purchaseOrderLineItemID = purchaseOrderLineItemID;
    }

    public PurchaseOrderLineItem(Integer purchaseOrderLineItemID, int quantity, int cost) {
        this.purchaseOrderLineItemID = purchaseOrderLineItemID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Integer getPurchaseOrderLineItemID() {
        return purchaseOrderLineItemID;
    }

    public void setPurchaseOrderLineItemID(Integer purchaseOrderLineItemID) {
        this.purchaseOrderLineItemID = purchaseOrderLineItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        hash += (purchaseOrderLineItemID != null ? purchaseOrderLineItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrderLineItem)) {
            return false;
        }
        PurchaseOrderLineItem other = (PurchaseOrderLineItem) object;
        if ((this.purchaseOrderLineItemID == null && other.purchaseOrderLineItemID != null) || (this.purchaseOrderLineItemID != null && !this.purchaseOrderLineItemID.equals(other.purchaseOrderLineItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.PurchaseOrderLineItem[ purchaseOrderLineItemID=" + purchaseOrderLineItemID + " ]";
    }
    
}
