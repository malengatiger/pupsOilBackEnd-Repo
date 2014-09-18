/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class RetailerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer retailerID;
    private String retailerName;
    private String telephone;
    private String representativesCellphone;
    private String email;
    private long dateRegistered;
    private String adress;
    private int activeFlag;
    private Double latitude;
    private Double longitude;
    private List<RetailerStaffDTO> retailerStaffList;
    private List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList;
    private RetailerCompanyDTO retailerCompany;
    private CityDTO city;
    private List<DriverDeliveryDTO> driverDeliveryList;

    public RetailerDTO() {
    }


    public RetailerDTO(Retailer a) {
        this.retailerID = a.getRetailerID();
        this.retailerName = a.getRetailerName();
        this.telephone = a.getTelephone();
        this.representativesCellphone = a.getRepresentativesCellphone();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        this.city = new CityDTO(a.getCity());
        this.adress = a.getAdress();
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
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

    public List<RetailerStaffDTO> getRetailerStaffList() {
        return retailerStaffList;
    }

    public void setRetailerStaffList(List<RetailerStaffDTO> retailerStaffList) {
        this.retailerStaffList = retailerStaffList;
    }

    public List<RetailerPurchaseOrderDTO> getRetailerPurchaseOrderList() {
        return retailerPurchaseOrderList;
    }

    public void setRetailerPurchaseOrderList(List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList) {
        this.retailerPurchaseOrderList = retailerPurchaseOrderList;
    }

    public RetailerCompanyDTO getRetailerCompany() {
        return retailerCompany;
    }

    public void setRetailerCompany(RetailerCompanyDTO retailerCompany) {
        this.retailerCompany = retailerCompany;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public List<DriverDeliveryDTO> getDriverDeliveryList() {
        return driverDeliveryList;
    }

    public void setDriverDeliveryList(List<DriverDeliveryDTO> driverDeliveryList) {
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
        if (!(object instanceof RetailerDTO)) {
            return false;
        }
        RetailerDTO other = (RetailerDTO) object;
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
