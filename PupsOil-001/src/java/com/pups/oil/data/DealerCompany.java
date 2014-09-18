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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @NamedQuery(name = "DealerCompany.findAll", query = "SELECT d FROM DealerCompany d"),
    @NamedQuery(name = "DealerCompany.findByDealerCompanyID", query = "SELECT d FROM DealerCompany d WHERE d.dealerCompanyID = :dealerCompanyID"),
    @NamedQuery(name = "DealerCompany.findByDealerCompanyName", query = "SELECT d FROM DealerCompany d WHERE d.dealerCompanyName = :dealerCompanyName"),
    @NamedQuery(name = "DealerCompany.findByTelephone", query = "SELECT d FROM DealerCompany d WHERE d.telephone = :telephone"),
    @NamedQuery(name = "DealerCompany.findByRepresentativesCellphone", query = "SELECT d FROM DealerCompany d WHERE d.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "DealerCompany.findByEmail", query = "SELECT d FROM DealerCompany d WHERE d.email = :email"),
    @NamedQuery(name = "DealerCompany.findByAddress", query = "SELECT d FROM DealerCompany d WHERE d.address = :address"),
    @NamedQuery(name = "DealerCompany.findByLatitude", query = "SELECT d FROM DealerCompany d WHERE d.latitude = :latitude"),
    @NamedQuery(name = "DealerCompany.findByLongitute", query = "SELECT d FROM DealerCompany d WHERE d.longitute = :longitute")})
public class DealerCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer dealerCompanyID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String dealerCompanyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String representativesCellphone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String email;
    @Size(max = 255)
    private String address;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitute;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerCompany")
    private List<RetailerPurchaseOrder> retailerPurchaseOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerCompany")
    private List<DealerBulkOrder> dealerBulkOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerCompany")
    private List<DealerCompanyStaff> dealerCompanyStaffList;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;

    public DealerCompany() {
    }

    public DealerCompany(Integer dealerCompanyID) {
        this.dealerCompanyID = dealerCompanyID;
    }

    public DealerCompany(Integer dealerCompanyID, String dealerCompanyName, String telephone, String representativesCellphone, String email) {
        this.dealerCompanyID = dealerCompanyID;
        this.dealerCompanyName = dealerCompanyName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
    }

    public Integer getDealerCompanyID() {
        return dealerCompanyID;
    }

    public void setDealerCompanyID(Integer dealerCompanyID) {
        this.dealerCompanyID = dealerCompanyID;
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<RetailerPurchaseOrder> getRetailerPurchaseOrderList() {
        return retailerPurchaseOrderList;
    }

    public void setRetailerPurchaseOrderList(List<RetailerPurchaseOrder> retailerPurchaseOrderList) {
        this.retailerPurchaseOrderList = retailerPurchaseOrderList;
    }

    public List<DealerBulkOrder> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrder> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public List<DealerCompanyStaff> getDealerCompanyStaffList() {
        return dealerCompanyStaffList;
    }

    public void setDealerCompanyStaffList(List<DealerCompanyStaff> dealerCompanyStaffList) {
        this.dealerCompanyStaffList = dealerCompanyStaffList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerCompanyID != null ? dealerCompanyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DealerCompany)) {
            return false;
        }
        DealerCompany other = (DealerCompany) object;
        if ((this.dealerCompanyID == null && other.dealerCompanyID != null) || (this.dealerCompanyID != null && !this.dealerCompanyID.equals(other.dealerCompanyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DealerCompany[ dealerCompanyID=" + dealerCompanyID + " ]";
    }
    
}
