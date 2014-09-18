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
public class TransporterCompanyDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer transporterCompanyID;  
    private String transporterCompanyName;  
    private String telephone; 
    private String representativesCellphone;  
    private String email; 
    private long dateRegistered;
    private String address; 
    private int activeFlag;
    private Double latitude;
    private Double longitude;
    private List<TankerDTO> tankerList;
    private List<DealerBulkOrderDTO> dealerBulkOrderList;
    
    private Integer cityID;
    private List<DriverDTO> driverList;
    private List<OrderScheduleDTO> orderScheduleList;

    public TransporterCompanyDTO() {
    }

    public TransporterCompanyDTO(TransporterCompany a) {
        transporterCompanyID = a.getTransporterCompanyID();
        transporterCompanyName = a.getTransporterCompanyName();
        telephone = a.getTelephone();
        representativesCellphone = a.getRepresentativesCellphone();
        email = a.getEmail();
        address = a.getAddress();
        dateRegistered = a.getDateRegistered().getTime();
        activeFlag = a.getActiveFlag();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
        cityID = a.getCity().getCityID();
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

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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

    public List<TankerDTO> getTankerList() {
        return tankerList;
    }

    public void setTankerList(List<TankerDTO> tankerList) {
        this.tankerList = tankerList;
    }

    public List<DealerBulkOrderDTO> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrderDTO> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

  

    public List<DriverDTO> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<DriverDTO> driverList) {
        this.driverList = driverList;
    }

    public List<OrderScheduleDTO> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderScheduleDTO> orderScheduleList) {
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
        if (!(object instanceof TransporterCompanyDTO)) {
            return false;
        }
        TransporterCompanyDTO other = (TransporterCompanyDTO) object;
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
