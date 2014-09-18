/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class DriverDeliveryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer driverDeliveryID;
    private Double latitude;
    private Double longitude;
    private long arrivalTime;
    private long departureTime; 
    private RetailerDTO retailer;
    private Integer driverLogRecordID;

    public DriverDeliveryDTO() {
    }

    public DriverDeliveryDTO( DriverDelivery a) {
        this.driverDeliveryID = a.getDriverDeliveryID();
        if (a.getLatitude() != null) {
        latitude = a.getLatitude();
        longitude = a.getLongitude();
        }
        if (a.getArrivalTime() != null) {
            arrivalTime = a.getArrivalTime().getTime();
        }
        if (a.getDepartureTime() != null) {
            departureTime = a.getDepartureTime().getTime();
        }
        retailer = new RetailerDTO(a.getRetailer());
        driverLogRecordID = a.getDriverLogRecord().getDriverLogRecordID();
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getDriverLogRecordID() {
        return driverLogRecordID;
    }

    public void setDriverLogRecordID(Integer driverLogRecordID) {
        this.driverLogRecordID = driverLogRecordID;
    }

    public Integer getDriverDeliveryID() {
        return driverDeliveryID;
    }

    public void setDriverDeliveryID(Integer driverDeliveryID) {
        this.driverDeliveryID = driverDeliveryID;
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


    public RetailerDTO getRetailer() {
        return retailer;
    }

    public void setRetailer(RetailerDTO retailer) {
        this.retailer = retailer;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverDeliveryID != null ? driverDeliveryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverDeliveryDTO)) {
            return false;
        }
        DriverDeliveryDTO other = (DriverDeliveryDTO) object;
        if ((this.driverDeliveryID == null && other.driverDeliveryID != null) || (this.driverDeliveryID != null && !this.driverDeliveryID.equals(other.driverDeliveryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DriverDelivery[ driverDeliveryID=" + driverDeliveryID + " ]";
    }
    
}
