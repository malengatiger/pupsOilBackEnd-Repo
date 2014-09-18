/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto;

import com.pups.oil.data.City;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class CityDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer cityID;
    
    private String cityName;
    private Double latitude;
    private Double longitude;
    private List<RetailerCompanyDTO> retailerCompanyList;
    private List<TransporterCompanyDTO> transporterCompanyList;
    private List<RetailerDTO> retailerList;
   
    private ProvinceDTO province;
    private List<DepotDTO> depotList;
    private List<DepotCompanyDTO> depotCompanyList;
    private List<DealerCompanyDTO> dealerCompanyList;
    
    public CityDTO(City a) {
        cityID = a.getCityID();
        cityName = a.getCityName();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
    }

    public CityDTO() {
    }

    public CityDTO(Integer cityID) {
        this.cityID = cityID;
    }

    public CityDTO(Integer cityID, String cityName) {
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

    public List<RetailerCompanyDTO> getRetailerCompanyList() {
        return retailerCompanyList;
    }

    public void setRetailerCompanyList(List<RetailerCompanyDTO> retailerCompanyList) {
        this.retailerCompanyList = retailerCompanyList;
    }

    public List<TransporterCompanyDTO> getTransporterCompanyList() {
        return transporterCompanyList;
    }

    public void setTransporterCompanyList(List<TransporterCompanyDTO> transporterCompanyList) {
        this.transporterCompanyList = transporterCompanyList;
    }

    public List<RetailerDTO> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<RetailerDTO> retailerList) {
        this.retailerList = retailerList;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

   

    public List<DepotDTO> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<DepotDTO> depotList) {
        this.depotList = depotList;
    }

    public List<DepotCompanyDTO> getDepotCompanyList() {
        return depotCompanyList;
    }

    public void setDepotCompanyList(List<DepotCompanyDTO> depotCompanyList) {
        this.depotCompanyList = depotCompanyList;
    }

    public List<DealerCompanyDTO> getDealerCompanyList() {
        return dealerCompanyList;
    }

    public void setDealerCompanyList(List<DealerCompanyDTO> dealerCompanyList) {
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
        if (!(object instanceof CityDTO)) {
            return false;
        }
        CityDTO other = (CityDTO) object;
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
