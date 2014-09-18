/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class PurchaseOrderLineItemDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer purchaseOrderLineItemID;
    private int quantity;
    private int cost;
    private ProductDTO product;
    private Integer retailerPurchaseOrderID;

    public PurchaseOrderLineItemDTO() {
    }

    public PurchaseOrderLineItemDTO(Integer purchaseOrderLineItemID) {
        this.purchaseOrderLineItemID = purchaseOrderLineItemID;
    }

    public PurchaseOrderLineItemDTO(PurchaseOrderLineItem a) {
        this.purchaseOrderLineItemID = a.getPurchaseOrderLineItemID();
        this.quantity = a.getQuantity();
        this.cost = a.getCost();
        this.product = new ProductDTO(a.getProduct());
        this.retailerPurchaseOrderID = a.getRetailerPurchaseOrder().getRetailerPurchaseOrderID();
    }

    public Integer getRetailerPurchaseOrderID() {
        return retailerPurchaseOrderID;
    }

    public void setRetailerPurchaseOrderID(Integer retailerPurchaseOrderID) {
        this.retailerPurchaseOrderID = retailerPurchaseOrderID;
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

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
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
        if (!(object instanceof PurchaseOrderLineItemDTO)) {
            return false;
        }
        PurchaseOrderLineItemDTO other = (PurchaseOrderLineItemDTO) object;
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
