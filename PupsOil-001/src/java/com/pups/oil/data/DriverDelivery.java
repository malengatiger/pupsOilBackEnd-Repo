/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "DriverDelivery.findAll", query = "SELECT d FROM DriverDelivery d"),
    @NamedQuery(name = "DriverDelivery.findByDriverDeliveryID", query = "SELECT d FROM DriverDelivery d WHERE d.driverDeliveryID = :driverDeliveryID"),
    @NamedQuery(name = "DriverDelivery.findByLatitude", query = "SELECT d FROM DriverDelivery d WHERE d.latitude = :latitude"),
    @NamedQuery(name = "DriverDelivery.findByLongitude", query = "SELECT d FROM DriverDelivery d WHERE d.longitude = :longitude"),
    @NamedQuery(name = "DriverDelivery.findByArrivalTime", query = "SELECT d FROM DriverDelivery d WHERE d.arrivalTime = :arrivalTime"),
    @NamedQuery(name = "DriverDelivery.findByDepartureTime", query = "SELECT d FROM DriverDelivery d WHERE d.departureTime = :departureTime")})
public class DriverDelivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer driverDeliveryID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureTime;
    
    @JoinColumn(name = "retailerID", referencedColumnName = "retailerID")
    @ManyToOne(optional = false)
    private Retailer retailer;
    @JoinColumn(name = "driverLogRecordID", referencedColumnName = "driverLogRecordID")
    @ManyToOne(optional = false)
    private DriverLogRecord driverLogRecord;

    public DriverDelivery() {
    }

    public DriverDelivery(Integer driverDeliveryID) {
        this.driverDeliveryID = driverDeliveryID;
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

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public DriverLogRecord getDriverLogRecord() {
        return driverLogRecord;
    }

    public void setDriverLogRecord(DriverLogRecord driverLogRecord) {
        this.driverLogRecord = driverLogRecord;
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
        if (!(object instanceof DriverDelivery)) {
            return false;
        }
        DriverDelivery other = (DriverDelivery) object;
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
