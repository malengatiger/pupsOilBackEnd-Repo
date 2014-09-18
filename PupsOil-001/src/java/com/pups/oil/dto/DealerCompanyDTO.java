/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto;

import com.pups.oil.data.DealerCompany;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class DealerCompanyDTO implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private Integer dealerCompanyID;
   
    private String dealerCompanyName;
   
    private String telephone;
  
    private String representativesCellphone;
    
    private String email;
    private String address;
    private Double latitude;
    private Double longitute;
    private List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList;
    private List<DealerBulkOrderDTO> dealerBulkOrderList;
    private List<DealerCompanyStaffDTO> dealerCompanyStaffList;
    private CityDTO city;

    public DealerCompanyDTO() {
    }

    public DealerCompanyDTO(DealerCompany a) {
        dealerCompanyID = a.getDealerCompanyID();
        dealerCompanyName = a.getDealerCompanyName();
        telephone = a.getTelephone();
        address = a.getAddress();
        email = a.getEmail();
        representativesCellphone = a.getRepresentativesCellphone();
        latitude = a.getLatitude();
        longitute = a.getLongitute();
        city = new CityDTO(a.getCity());
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

    public List<RetailerPurchaseOrderDTO> getRetailerPurchaseOrderList() {
        return retailerPurchaseOrderList;
    }

    public void setRetailerPurchaseOrderList(List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList) {
        this.retailerPurchaseOrderList = retailerPurchaseOrderList;
    }

    public List<DealerBulkOrderDTO> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrderDTO> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public List<DealerCompanyStaffDTO> getDealerCompanyStaffList() {
        return dealerCompanyStaffList;
    }

    public void setDealerCompanyStaffList(List<DealerCompanyStaffDTO> dealerCompanyStaffList) {
        this.dealerCompanyStaffList = dealerCompanyStaffList;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
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
        if (!(object instanceof DealerCompanyDTO)) {
            return false;
        }
        DealerCompanyDTO other = (DealerCompanyDTO) object;
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
