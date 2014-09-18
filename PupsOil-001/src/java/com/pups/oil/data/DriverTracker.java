/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "DriverTracker.findAll", query = "SELECT d FROM DriverTracker d"),
    @NamedQuery(name = "DriverTracker.findByDriverTrackerID", query = "SELECT d FROM DriverTracker d WHERE d.driverTrackerID = :driverTrackerID"),
    @NamedQuery(name = "DriverTracker.findByTime", query = "SELECT d FROM DriverTracker d WHERE d.time = :time"),
    @NamedQuery(name = "DriverTracker.findByLatitude", query = "SELECT d FROM DriverTracker d WHERE d.latitude = :latitude"),
    @NamedQuery(name = "DriverTracker.findByLongitude", query = "SELECT d FROM DriverTracker d WHERE d.longitude = :longitude")})
public class DriverTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer driverTrackerID;
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @JoinColumn(name = "driverID", referencedColumnName = "driverID")
    @ManyToOne(optional = false)
    private Driver driver;

    public DriverTracker() {
    }

    public DriverTracker(Integer driverTrackerID) {
        this.driverTrackerID = driverTrackerID;
    }

    public Integer getDriverTrackerID() {
        return driverTrackerID;
    }

    public void setDriverTrackerID(Integer driverTrackerID) {
        this.driverTrackerID = driverTrackerID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
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
        if (!(object instanceof DriverTracker)) {
            return false;
        }
        DriverTracker other = (DriverTracker) object;
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
