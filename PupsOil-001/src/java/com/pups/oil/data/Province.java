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
    @NamedQuery(name = "Province.findAll", query = "SELECT p FROM Province p"),
    @NamedQuery(name = "Province.findByProvinceID", query = "SELECT p FROM Province p WHERE p.provinceID = :provinceID"),
    @NamedQuery(name = "Province.findByProvinceName", query = "SELECT p FROM Province p WHERE p.provinceName = :provinceName"),
    @NamedQuery(name = "Province.findByLatitude", query = "SELECT p FROM Province p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "Province.findByLongitude", query = "SELECT p FROM Province p WHERE p.longitude = :longitude")})
public class Province implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer provinceID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String provinceName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "province")
    private List<City> cityList;
    @JoinColumn(name = "countryID", referencedColumnName = "countryID")
    @ManyToOne(optional = false)
    private Country country;

    public Province() {
    }

    public Province(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Province(Integer provinceID, String provinceName) {
        this.provinceID = provinceID;
        this.provinceName = provinceName;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provinceID != null ? provinceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Province)) {
            return false;
        }
        Province other = (Province) object;
        if ((this.provinceID == null && other.provinceID != null) || (this.provinceID != null && !this.provinceID.equals(other.provinceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Province[ provinceID=" + provinceID + " ]";
    }
    
}
