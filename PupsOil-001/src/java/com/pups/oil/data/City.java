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
    @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c"),
    @NamedQuery(name = "City.findByCityID", query = "SELECT c FROM City c WHERE c.cityID = :cityID"),
    @NamedQuery(name = "City.findByCityName", query = "SELECT c FROM City c WHERE c.cityName = :cityName"),
    @NamedQuery(name = "City.findByLatitude", query = "SELECT c FROM City c WHERE c.latitude = :latitude"),
    @NamedQuery(name = "City.findByLongitude", query = "SELECT c FROM City c WHERE c.longitude = :longitude")})
public class City implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer cityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String cityName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<RetailerCompany> retailerCompanyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<TransporterCompany> transporterCompanyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Retailer> retailerList;
    @JoinColumn(name = "provinceID", referencedColumnName = "provinceID")
    @ManyToOne(optional = false)
    private Province province;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Depot> depotList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<DepotCompany> depotCompanyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<DealerCompany> dealerCompanyList;

    public City() {
    }

    public City(Integer cityID) {
        this.cityID = cityID;
    }

    public City(Integer cityID, String cityName) {
        this.cityID = cityID;
        this.cityName = cityName;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public List<RetailerCompany> getRetailerCompanyList() {
        return retailerCompanyList;
    }

    public void setRetailerCompanyList(List<RetailerCompany> retailerCompanyList) {
        this.retailerCompanyList = retailerCompanyList;
    }

    public List<TransporterCompany> getTransporterCompanyList() {
        return transporterCompanyList;
    }

    public void setTransporterCompanyList(List<TransporterCompany> transporterCompanyList) {
        this.transporterCompanyList = transporterCompanyList;
    }

    public List<Retailer> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<Retailer> retailerList) {
        this.retailerList = retailerList;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

   

    public List<Depot> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<Depot> depotList) {
        this.depotList = depotList;
    }

    public List<DepotCompany> getDepotCompanyList() {
        return depotCompanyList;
    }

    public void setDepotCompanyList(List<DepotCompany> depotCompanyList) {
        this.depotCompanyList = depotCompanyList;
    }

    public List<DealerCompany> getDealerCompanyList() {
        return dealerCompanyList;
    }

    public void setDealerCompanyList(List<DealerCompany> dealerCompanyList) {
        this.dealerCompanyList = dealerCompanyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityID != null ? cityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
        if ((this.cityID == null && other.cityID != null) || (this.cityID != null && !this.cityID.equals(other.cityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.City[ cityID=" + cityID + " ]";
    }
    
}
