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
    @NamedQuery(name = "BulkOrderLineItem.findAll", query = "SELECT b FROM BulkOrderLineItem b"),
    @NamedQuery(name = "BulkOrderLineItem.findByBulkOrderLineItemID", query = "SELECT b FROM BulkOrderLineItem b WHERE b.bulkOrderLineItemID = :bulkOrderLineItemID"),
    @NamedQuery(name = "BulkOrderLineItem.findByQuantity", query = "SELECT b FROM BulkOrderLineItem b WHERE b.quantity = :quantity")})
public class BulkOrderLineItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer bulkOrderLineItemID;
    @Basic(optional = false)
    @NotNull
    private int quantity;
    @JoinColumn(name = "productID", referencedColumnName = "productID")
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "dealerBulkOrderID", referencedColumnName = "dealerCompanyID")
    @ManyToOne(optional = false)
    private DealerBulkOrder dealerBulkOrder;

    public BulkOrderLineItem() {
    }

    public BulkOrderLineItem(Integer bulkOrderLineItemID) {
        this.bulkOrderLineItemID = bulkOrderLineItemID;
    }

    public BulkOrderLineItem(Integer bulkOrderLineItemID, int quantity) {
        this.bulkOrderLineItemID = bulkOrderLineItemID;
        this.quantity = quantity;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

   
    public DealerBulkOrder getDealerBulkOrder() {
        return dealerBulkOrder;
    }

    public void setDealerBulkOrder(DealerBulkOrder dealerBulkOrder) {
        this.dealerBulkOrder = dealerBulkOrder;
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
        if (!(object instanceof BulkOrderLineItem)) {
            return false;
        }
        BulkOrderLineItem other = (BulkOrderLineItem) object;
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
