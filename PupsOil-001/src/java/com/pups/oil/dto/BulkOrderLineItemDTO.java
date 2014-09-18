/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.BulkOrderLineItem;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class BulkOrderLineItemDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer bulkOrderLineItemID;
    private int quantity;
    private ProductDTO product;
    private Integer dealerBulkOrderID;

    public BulkOrderLineItemDTO() {
    }

    public BulkOrderLineItemDTO(BulkOrderLineItem a) {
        this.bulkOrderLineItemID = a.getBulkOrderLineItemID();
        product = new ProductDTO(a.getProduct());
        quantity = a.getQuantity();
        dealerBulkOrderID = a.getDealerBulkOrder().getDealerBulkOrderID();

    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public Integer getDealerBulkOrderID() {
        return dealerBulkOrderID;
    }

    public void setDealerBulkOrderID(Integer dealerBulkOrderID) {
        this.dealerBulkOrderID = dealerBulkOrderID;
    }

    public Integer getBulkOrderLineItemID() {
        return bulkOrderLineItemID;
    }

    public void setBulkOrderLineItemID(Integer bulkOrderLineItemID) {
        this.bulkOrderLineItemID = bulkOrderLineItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bulkOrderLineItemID != null ? bulkOrderLineItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BulkOrderLineItemDTO)) {
            return false;
        }
        BulkOrderLineItemDTO other = (BulkOrderLineItemDTO) object;
        if ((this.bulkOrderLineItemID == null && other.bulkOrderLineItemID != null) || (this.bulkOrderLineItemID != null && !this.bulkOrderLineItemID.equals(other.bulkOrderLineItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.BulkOrderLineItem[ bulkOrderLineItemID=" + bulkOrderLineItemID + " ]";
    }

}
