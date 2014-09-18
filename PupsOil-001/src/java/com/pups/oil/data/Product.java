/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByProductID", query = "SELECT p FROM Product p WHERE p.productID = :productID"),
    @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName"),
    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
    @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String productName;
    @Basic(optional = false)
    @NotNull
    private double price;
    @Size(max = 255)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<PurchaseOrderLineItem> purchaseOrderLineItemList;
    @JoinColumn(name = "retailerCompanyID", referencedColumnName = "retailerCompanyID")
    @ManyToOne(optional = false)
    private RetailerCompany retailerCompany;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<BulkOrderLineItem> bulkOrderLineItemList;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product(Integer productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public Integer getProductID() {
        return productID;
    }

    public RetailerCompany getRetailerCompany() {
        return retailerCompany;
    }

    public void setRetailerCompany(RetailerCompany retailerCompany) {
        this.retailerCompany = retailerCompany;
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

    public List<PurchaseOrderLineItem> getPurchaseOrderLineItemList() {
        return purchaseOrderLineItemList;
    }

    public void setPurchaseOrderLineItemList(List<PurchaseOrderLineItem> purchaseOrderLineItemList) {
        this.purchaseOrderLineItemList = purchaseOrderLineItemList;
    }


    public List<BulkOrderLineItem> getBulkOrderLineItemList() {
        return bulkOrderLineItemList;
    }

    public void setBulkOrderLineItemList(List<BulkOrderLineItem> bulkOrderLineItemList) {
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
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
