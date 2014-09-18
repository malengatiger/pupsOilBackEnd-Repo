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
    @NamedQuery(name = "RetailerCompany.findAll", query = "SELECT r FROM RetailerCompany r"),
    @NamedQuery(name = "RetailerCompany.findByRetailerCompanyID", query = "SELECT r FROM RetailerCompany r WHERE r.retailerCompanyID = :retailerCompanyID"),
    @NamedQuery(name = "RetailerCompany.findByRetailerCompanyName", query = "SELECT r FROM RetailerCompany r WHERE r.retailerCompanyName = :retailerCompanyName"),
    @NamedQuery(name = "RetailerCompany.findByTelephone", query = "SELECT r FROM RetailerCompany r WHERE r.telephone = :telephone"),
    @NamedQuery(name = "RetailerCompany.findByRepresentativesCellphone", query = "SELECT r FROM RetailerCompany r WHERE r.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "RetailerCompany.findByEmail", query = "SELECT r FROM RetailerCompany r WHERE r.email = :email"),
    @NamedQuery(name = "RetailerCompany.findByDateRegistered", query = "SELECT r FROM RetailerCompany r WHERE r.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "RetailerCompany.findByAddress", query = "SELECT r FROM RetailerCompany r WHERE r.address = :address"),
    @NamedQuery(name = "RetailerCompany.findByActiveFlag", query = "SELECT r FROM RetailerCompany r WHERE r.activeFlag = :activeFlag"),
    @NamedQuery(name = "RetailerCompany.findByLatitude", query = "SELECT r FROM RetailerCompany r WHERE r.latitude = :latitude"),
    @NamedQuery(name = "RetailerCompany.findByLongitute", query = "SELECT r FROM RetailerCompany r WHERE r.longitute = :longitute")})
public class RetailerCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer retailerCompanyID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String retailerCompanyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String representativesCellphone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Size(max = 255)
    private String address;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    private Double latitude;
    private Double longitute;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerCompany")
    private List<Retailer> retailerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerCompany")
    private List<Product> productList;

    public RetailerCompany() {
    }

    public RetailerCompany(Integer retailerCompanyID) {
        this.retailerCompanyID = retailerCompanyID;
    }

    public RetailerCompany(Integer retailerCompanyID, String retailerCompanyName, String telephone, String representativesCellphone, String email, Date dateRegistered, int activeFlag) {
        this.retailerCompanyID = retailerCompanyID;
        this.retailerCompanyName = retailerCompanyName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public Integer getRetailerCompanyID() {
        return retailerCompanyID;
    }

    public void setRetailerCompanyID(Integer retailerCompanyID) {
        this.retailerCompanyID = retailerCompanyID;
    }

    public String getRetailerCompanyName() {
        return retailerCompanyName;
    }

    public void setRetailerCompanyName(String retailerCompanyName) {
        this.retailerCompanyName = retailerCompanyName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRepresentativesCellphone() {
        return representativesCellphone;
    }

    public void setRepresentativesCellphone(String representativesCellphone) {
        this.representativesCellphone = representativesCellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitute() {
        return longitute;
    }

    public void setLongitute(Double longitute) {
        this.longitute = longitute;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Retailer> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<Retailer> retailerList) {
        this.retailerList = retailerList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerCompanyID != null ? retailerCompanyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetailerCompany)) {
            return false;
        }
        RetailerCompany other = (RetailerCompany) object;
        if ((this.retailerCompanyID == null && other.retailerCompanyID != null) || (this.retailerCompanyID != null && !this.retailerCompanyID.equals(other.retailerCompanyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.RetailerCompany[ retailerCompanyID=" + retailerCompanyID + " ]";
    }
    
}
