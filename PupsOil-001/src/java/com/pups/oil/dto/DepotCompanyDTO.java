/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.DepotCompany;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class DepotCompanyDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer depotCompanyID;
    private String depotCompanyName;
    private String telephone;
    private String representativesCellphone;
    private String email;
    private long dateRegistered;
    private String address;
    private int activeFlag;
    private Double latitude;
    private Double longitude;
    private List<DepotDTO> depotList;
    private CityDTO city;

    public DepotCompanyDTO() {
    }

    public DepotCompanyDTO(Integer depotCompanyID) {
        this.depotCompanyID = depotCompanyID;
    }

    public DepotCompanyDTO(DepotCompany a) {
        this.depotCompanyID = a.getDepotCompanyID();
        this.depotCompanyName = a.getDepotCompanyName();
        this.telephone = a.getTelephone();
        this.representativesCellphone = a.getRepresentativesCellphone();
        this.email = a.getEmail();
        this.dateRegistered = a.getDateRegistered().getTime();
        this.activeFlag = a.getActiveFlag();
        address = a.getAddress();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
        city = new CityDTO(a.getCity());
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

    public List<DepotDTO> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<DepotDTO> depotList) {
        this.depotList = depotList;
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
        hash += (depotCompanyID != null ? depotCompanyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepotCompanyDTO)) {
            return false;
        }
        DepotCompanyDTO other = (DepotCompanyDTO) object;
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
