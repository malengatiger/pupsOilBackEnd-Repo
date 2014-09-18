/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.Depot;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class DepotDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer depotID;
    private String depotName;
    private String telephone;
    private String representativesCellphone;
    private String email;
    private long dateRegistered;
    private String address;
    private int activeFlag;
    private Double latitude;
    private Double longitude;
    private List<DealerBulkOrderDTO> dealerBulkOrderList;
    private DepotCompanyDTO depotCompany;
    private CityDTO city;
    private List<DriverLogRecordDTO> driverLogRecordList;

    public DepotDTO() {
    }

    public DepotDTO(Integer depotID) {
        this.depotID = depotID;
    }

    public DepotDTO(Depot a) {
        this.depotID = a.getDepotID();
        this.depotName = a.getDepotName();
        this.telephone = a.getTelephone();
        this.representativesCellphone = a.getRepresentativesCellphone();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
        address = a.getAddress();
        city = new CityDTO(a.getCity());
        depotCompany = new DepotCompanyDTO(a.getDepotCompany());
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<DealerBulkOrderDTO> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrderDTO> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public DepotCompanyDTO getDepotCompany() {
        return depotCompany;
    }

    public void setDepotCompany(DepotCompanyDTO depotCompany) {
        this.depotCompany = depotCompany;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public List<DriverLogRecordDTO> getDriverLogRecordList() {
        return driverLogRecordList;
    }

    public void setDriverLogRecordList(List<DriverLogRecordDTO> driverLogRecordList) {
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
        if (!(object instanceof DepotDTO)) {
            return false;
        }
        DepotDTO other = (DepotDTO) object;
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
