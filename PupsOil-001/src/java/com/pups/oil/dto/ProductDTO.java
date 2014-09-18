/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer productID;
    private String productName;
    private double price;
    private String description;
    private List<PurchaseOrderLineItemDTO> purchaseOrderLineItemList;
    private Integer retailerCompanyID;
    private List<BulkOrderLineItemDTO> bulkOrderLineItemList;

    public ProductDTO() {
    }

    public ProductDTO(Product a) {
        this.productID = a.getProductID();
        productName = a.getProductName();
        description = a.getDescription();
        price = a.getPrice();
        retailerCompanyID = a.getRetailerCompany().getRetailerCompanyID();
    }

    public Integer getRetailerCompanyID() {
        return retailerCompanyID;
    }

    public void setRetailerCompanyID(Integer retailerCompanyID) {
        this.retailerCompanyID = retailerCompanyID;
    }

   

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PurchaseOrderLineItemDTO> getPurchaseOrderLineItemList() {
        return purchaseOrderLineItemList;
    }

    public void setPurchaseOrderLineItemList(List<PurchaseOrderLineItemDTO> purchaseOrderLineItemList) {
        this.purchaseOrderLineItemList = purchaseOrderLineItemList;
    }

    public List<BulkOrderLineItemDTO> getBulkOrderLineItemList() {
        return bulkOrderLineItemList;
    }

    public void setBulkOrderLineItemList(List<BulkOrderLineItemDTO> bulkOrderLineItemList) {
        this.bulkOrderLineItemList = bulkOrderLineItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDTO)) {
            return false;
        }
        ProductDTO other = (ProductDTO) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Product[ productID=" + productID + " ]";
    }

}
