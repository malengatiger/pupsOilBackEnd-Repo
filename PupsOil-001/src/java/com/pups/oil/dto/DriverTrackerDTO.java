/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto;

import com.pups.oil.data.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aubreyM
 */
public class DriverTrackerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer driverTrackerID;
    private long time;
    private Double latitude;
    private Double longitude;
    
    private DriverDTO driver;

    public DriverTrackerDTO() {
    }

    public DriverTrackerDTO(DriverTracker a) {
        this.driverTrackerID = a.getDriverTrackerID();
        time = a.getTime().getTime();
        latitude = a.getLatitude();
        longitude = a.getLongitude();
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Integer getDriverTrackerID() {
        return driverTrackerID;
    }

    public void setDriverTrackerID(Integer driverTrackerID) {
        this.driverTrackerID = driverTrackerID;
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

    public DriverDTO getDriver() {
        return driver;
    }

    public void setDriver(DriverDTO driver) {
        this.driver = driver;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverTrackerID != null ? driverTrackerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverTrackerDTO)) {
            return false;
        }
        DriverTrackerDTO other = (DriverTrackerDTO) object;
        if ((this.driverTrackerID == null && other.driverTrackerID != null) || (this.driverTrackerID != null && !this.driverTrackerID.equals(other.driverTrackerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DriverTracker[ driverTrackerID=" + driverTrackerID + " ]";
    }
    
}
