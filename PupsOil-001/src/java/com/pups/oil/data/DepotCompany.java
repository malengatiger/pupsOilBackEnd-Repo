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
    @NamedQuery(name = "DepotCompany.findAll", query = "SELECT d FROM DepotCompany d"),
    @NamedQuery(name = "DepotCompany.findByDepotCompanyID", query = "SELECT d FROM DepotCompany d WHERE d.depotCompanyID = :depotCompanyID"),
    @NamedQuery(name = "DepotCompany.findByDepotCompanyName", query = "SELECT d FROM DepotCompany d WHERE d.depotCompanyName = :depotCompanyName"),
    @NamedQuery(name = "DepotCompany.findByTelephone", query = "SELECT d FROM DepotCompany d WHERE d.telephone = :telephone"),
    @NamedQuery(name = "DepotCompany.findByRepresentativesCellphone", query = "SELECT d FROM DepotCompany d WHERE d.representativesCellphone = :representativesCellphone"),
    @NamedQuery(name = "DepotCompany.findByEmail", query = "SELECT d FROM DepotCompany d WHERE d.email = :email"),
    @NamedQuery(name = "DepotCompany.findByDateRegistered", query = "SELECT d FROM DepotCompany d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "DepotCompany.findByAddress", query = "SELECT d FROM DepotCompany d WHERE d.address = :address"),
    @NamedQuery(name = "DepotCompany.findByActiveFlag", query = "SELECT d FROM DepotCompany d WHERE d.activeFlag = :activeFlag"),
    @NamedQuery(name = "DepotCompany.findByLatitude", query = "SELECT d FROM DepotCompany d WHERE d.latitude = :latitude"),
    @NamedQuery(name = "DepotCompany.findByLongitude", query = "SELECT d FROM DepotCompany d WHERE d.longitude = :longitude")})
public class DepotCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer depotCompanyID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String depotCompanyName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depotCompany")
    private List<Depot> depotList;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;

    public DepotCompany() {
    }

    public DepotCompany(Integer depotCompanyID) {
        this.depotCompanyID = depotCompanyID;
    }

    public DepotCompany(Integer depotCompanyID, String depotCompanyName, String telephone, String representativesCellphone, String email, Date dateRegistered, int activeFlag) {
        this.depotCompanyID = depotCompanyID;
        this.depotCompanyName = depotCompanyName;
        this.telephone = telephone;
        this.representativesCellphone = representativesCellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
    }

    public Integer getDepotCompanyID() {
        return depotCompanyID;
    }

    public void setDepotCompanyID(Integer depotCompanyID) {
        this.depotCompanyID = depotCompanyID;
    }

    public String getDepotCompanyName() {
        return depotCompanyName;
    }

    public void setDepotCompanyName(String depotCompanyName) {
        this.depotCompanyName = depotCompanyName;
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

    public List<Depot> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<Depot> depotList) {
        this.depotList = depotList;
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
        hash += (depotCompanyID != null ? depotCompanyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepotCompany)) {
            return false;
        }
        DepotCompany other = (DepotCompany) object;
        if ((this.depotCompanyID == null && other.depotCompanyID != null) || (this.depotCompanyID != null && !this.depotCompanyID.equals(other.depotCompanyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DepotCompany[ depotCompanyID=" + depotCompanyID + " ]";
    }
    
}
