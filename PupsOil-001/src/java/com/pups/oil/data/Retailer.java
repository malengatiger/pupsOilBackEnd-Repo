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
    @NamedQuery(name = "Retailer.findAll", query = "SELECT r FROM Retailer r"),
    @NamedQuery(name = "Retailer.findByRetailerID", query = "SELECT r FROM Retailer r WHERE r.retailerID = :retailerID"),
    @NamedQuery(name = "Retailer.findByRetailerName", query = "SELECT r FROM Retailer r WHERE r.retailerName = :retailerName"),
    @NamedQuery(name = "Retailer.findByTelephone", query = "SELECT r FROM Retailer r WHERE r.telephone = :telephone"),
    @NamedQuery(name = "Retailer.findByRepresentativesCellphone", query = "SELECT r FROM Retailer r WHERE r.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "Retailer.findByEmail", query = "SELECT r FROM Retailer r WHERE r.email = :email"),
    @NamedQuery(name = "Retailer.findByDateRegistered", query = "SELECT r FROM Retailer r WHERE r.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Retailer.findByAdress", query = "SELECT r FROM Retailer r WHERE r.adress = :adress"),
    @NamedQuery(name = "Retailer.findByActiveFlag", query = "SELECT r FROM Retailer r WHERE r.activeFlag = :activeFlag"),
    @NamedQuery(name = "Retailer.findByLatitude", query = "SELECT r FROM Retailer r WHERE r.latitude = :latitude"),
    @NamedQuery(name = "Retailer.findByLongitude", query = "SELECT r FROM Retailer r WHERE r.longitude = :longitude")})
public class Retailer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer retailerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String retailerName;
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
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Size(max = 255)
    private String adress;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<RetailerStaff> retailerStaffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<RetailerPurchaseOrder> retailerPurchaseOrderList;
    @JoinColumn(name = "retailerCompanyID", referencedColumnName = "retailerCompanyID")
    @ManyToOne(optional = false)
    private RetailerCompany retailerCompany;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<DriverDelivery> driverDeliveryList;

    public Retailer() {
    }

    public Retailer(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public Retailer(Integer retailerID, String retailerName, String telephone, String representativesCellphone, String email, Date dateRegistered, int activeFlag) {
        this.retailerID = retailerID;
        this.retailerName = retailerName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public Integer getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<RetailerStaff> getRetailerStaffList() {
        return retailerStaffList;
    }

    public void setRetailerStaffList(List<RetailerStaff> retailerStaffList) {
        this.retailerStaffList = retailerStaffList;
    }

    public List<RetailerPurchaseOrder> getRetailerPurchaseOrderList() {
        return retailerPurchaseOrderList;
    }

    public void setRetailerPurchaseOrderList(List<RetailerPurchaseOrder> retailerPurchaseOrderList) {
        this.retailerPurchaseOrderList = retailerPurchaseOrderList;
    }

    public RetailerCompany getRetailerCompany() {
        return retailerCompany;
    }

    public void setRetailerCompany(RetailerCompany retailerCompany) {
        this.retailerCompany = retailerCompany;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

   

    public List<DriverDelivery> getDriverDeliveryList() {
        return driverDeliveryList;
    }

    public void setDriverDeliveryList(List<DriverDelivery> driverDeliveryList) {
        this.driverDeliveryList = driverDeliveryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retailerID != null ? retailerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retailer)) {
            return false;
        }
        Retailer other = (Retailer) object;
        if ((this.retailerID == null && other.retailerID != null) || (this.retailerID != null && !this.retailerID.equals(other.retailerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Retailer[ retailerID=" + retailerID + " ]";
    }
    
}
