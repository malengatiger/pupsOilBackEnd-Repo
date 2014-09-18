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
    @NamedQuery(name = "Depot.findAll", query = "SELECT d FROM Depot d"),
    @NamedQuery(name = "Depot.findByDepotID", query = "SELECT d FROM Depot d WHERE d.depotID = :depotID"),
    @NamedQuery(name = "Depot.findByDepotName", query = "SELECT d FROM Depot d WHERE d.depotName = :depotName"),
    @NamedQuery(name = "Depot.findByTelephone", query = "SELECT d FROM Depot d WHERE d.telephone = :telephone"),
    @NamedQuery(name = "Depot.findByRepresentativesCellphone", query = "SELECT d FROM Depot d WHERE d.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "Depot.findByEmail", query = "SELECT d FROM Depot d WHERE d.email = :email"),
    @NamedQuery(name = "Depot.findByDateRegistered", query = "SELECT d FROM Depot d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Depot.findByAddress", query = "SELECT d FROM Depot d WHERE d.address = :address"),
    @NamedQuery(name = "Depot.findByActiveFlag", query = "SELECT d FROM Depot d WHERE d.activeFlag = :activeFlag"),
    @NamedQuery(name = "Depot.findByLatitude", query = "SELECT d FROM Depot d WHERE d.latitude = :latitude"),
    @NamedQuery(name = "Depot.findByLongitude", query = "SELECT d FROM Depot d WHERE d.longitude = :longitude")})
public class Depot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer depotID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String depotName;
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
    private String address;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depot")
    private List<DealerBulkOrder> dealerBulkOrderList;
    @JoinColumn(name = "depotCompanyID", referencedColumnName = "depotCompanyID")
    @ManyToOne(optional = false)
    private DepotCompany depotCompany;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depot")
    private List<DriverLogRecord> driverLogRecordList;

    public Depot() {
    }

    public Depot(Integer depotID) {
        this.depotID = depotID;
    }

    public Depot(Integer depotID, String depotName, String telephone, String representativesCellphone, String email, Date dateRegistered, int activeFlag) {
        this.depotID = depotID;
        this.depotName = depotName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public Integer getDepotID() {
        return depotID;
    }

    public void setDepotID(Integer depotID) {
        this.depotID = depotID;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
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

    public List<DealerBulkOrder> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrder> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public DepotCompany getDepotCompany() {
        return depotCompany;
    }

    public void setDepotCompany(DepotCompany depotCompany) {
        this.depotCompany = depotCompany;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public List<DriverLogRecord> getDriverLogRecordList() {
        return driverLogRecordList;
    }

    public void setDriverLogRecordList(List<DriverLogRecord> driverLogRecordList) {
        this.driverLogRecordList = driverLogRecordList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depotID != null ? depotID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depot)) {
            return false;
        }
        Depot other = (Depot) object;
        if ((this.depotID == null && other.depotID != null) || (this.depotID != null && !this.depotID.equals(other.depotID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Depot[ depotID=" + depotID + " ]";
    }
    
}
