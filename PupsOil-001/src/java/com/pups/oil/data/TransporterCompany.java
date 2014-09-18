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
    @NamedQuery(name = "TransporterCompany.findAll", query = "SELECT t FROM TransporterCompany t"),
    @NamedQuery(name = "TransporterCompany.findByTransporterCompanyID", query = "SELECT t FROM TransporterCompany t WHERE t.transporterCompanyID = :transporterCompanyID"),
    @NamedQuery(name = "TransporterCompany.findByTransporterCompanyName", query = "SELECT t FROM TransporterCompany t WHERE t.transporterCompanyName = :transporterCompanyName"),
    @NamedQuery(name = "TransporterCompany.findByTelephone", query = "SELECT t FROM TransporterCompany t WHERE t.telephone = :telephone"),
    @NamedQuery(name = "TransporterCompany.findByRepresentativesCellphone", query = "SELECT t FROM TransporterCompany t WHERE t.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "TransporterCompany.findByEmail", query = "SELECT t FROM TransporterCompany t WHERE t.email = :email"),
    @NamedQuery(name = "TransporterCompany.findByDateRegistered", query = "SELECT t FROM TransporterCompany t WHERE t.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "TransporterCompany.findByAddress", query = "SELECT t FROM TransporterCompany t WHERE t.address = :address"),
    @NamedQuery(name = "TransporterCompany.findByActiveFlag", query = "SELECT t FROM TransporterCompany t WHERE t.activeFlag = :activeFlag"),
    @NamedQuery(name = "TransporterCompany.findByLatitude", query = "SELECT t FROM TransporterCompany t WHERE t.latitude = :latitude"),
    @NamedQuery(name = "TransporterCompany.findByLongitude", query = "SELECT t FROM TransporterCompany t WHERE t.longitude = :longitude")})
public class TransporterCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer transporterCompanyID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String transporterCompanyName;
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
    private Double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transporterCompany")
    private List<Tanker> tankerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transporterCompany")
    private List<DealerBulkOrder> dealerBulkOrderList;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transporterCompany")
    private List<Driver> driverList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transporterCompany")
    private List<OrderSchedule> orderScheduleList;

    public TransporterCompany() {
    }

    public TransporterCompany(Integer transporterCompanyID) {
        this.transporterCompanyID = transporterCompanyID;
    }

    public TransporterCompany(Integer transporterCompanyID, String transporterCompanyName, String telephone, String representativesCellphone, String email, Date dateRegistered, int activeFlag) {
        this.transporterCompanyID = transporterCompanyID;
        this.transporterCompanyName = transporterCompanyName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public Integer getTransporterCompanyID() {
        return transporterCompanyID;
    }

    public void setTransporterCompanyID(Integer transporterCompanyID) {
        this.transporterCompanyID = transporterCompanyID;
    }

    public String getTransporterCompanyName() {
        return transporterCompanyName;
    }

    public void setTransporterCompanyName(String transporterCompanyName) {
        this.transporterCompanyName = transporterCompanyName;
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<Tanker> getTankerList() {
        return tankerList;
    }

    public void setTankerList(List<Tanker> tankerList) {
        this.tankerList = tankerList;
    }

    public List<DealerBulkOrder> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrder> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    public List<OrderSchedule> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderSchedule> orderScheduleList) {
        this.orderScheduleList = orderScheduleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transporterCompanyID != null ? transporterCompanyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransporterCompany)) {
            return false;
        }
        TransporterCompany other = (TransporterCompany) object;
        if ((this.transporterCompanyID == null && other.transporterCompanyID != null) || (this.transporterCompanyID != null && !this.transporterCompanyID.equals(other.transporterCompanyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.TransporterCompany[ transporterCompanyID=" + transporterCompanyID + " ]";
    }
    
}
