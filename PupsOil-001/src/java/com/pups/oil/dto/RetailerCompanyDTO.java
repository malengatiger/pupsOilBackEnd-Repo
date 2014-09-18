/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.RetailerCompany;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class RetailerCompanyDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer retailerCompanyID;
    private String retailerCompanyName;
    private String telephone;
    private String representativesCellphone;
    private String email;
    private long dateRegistered;
    private String address;
    private int activeFlag;
    private Double latitude;
    private Double longitute;
    private CityDTO city;
    private List<RetailerDTO> retailerList;
    private List<ProductDTO> productList;

    public RetailerCompanyDTO() {
    }

    public RetailerCompanyDTO(Integer retailerCompanyID) {
        this.retailerCompanyID = retailerCompanyID;
    }

    public RetailerCompanyDTO(RetailerCompany a) {
        this.retailerCompanyID = a.getRetailerCompanyID();
        this.retailerCompanyName = a.getRetailerCompanyName();
        this.telephone = a.getTelephone();
        this.representativesCellphone = a.getRepresentativesCellphone();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        this.latitude = a.getLatitude();
        this.longitute = a.getLongitute();
        this.city = new CityDTO(a.getCity());
        this.address = a.getAddress();
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
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

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public List<RetailerDTO> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<RetailerDTO> retailerList) {
        this.retailerList = retailerList;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
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
        if (!(object instanceof RetailerCompanyDTO)) {
            return false;
        }
        RetailerCompanyDTO other = (RetailerCompanyDTO) object;
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
