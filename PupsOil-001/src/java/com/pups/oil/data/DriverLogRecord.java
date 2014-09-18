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
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "DriverLogRecord.findAll", query = "SELECT d FROM DriverLogRecord d"),
    @NamedQuery(name = "DriverLogRecord.findByDriverLogRecordID", query = "SELECT d FROM DriverLogRecord d WHERE d.driverLogRecordID = :driverLogRecordID"),
    @NamedQuery(name = "DriverLogRecord.findByOdometerAtStart", query = "SELECT d FROM DriverLogRecord d WHERE d.odometerAtStart = :odometerAtStart"),
    @NamedQuery(name = "DriverLogRecord.findByOdometerAtEnd", query = "SELECT d FROM DriverLogRecord d WHERE d.odometerAtEnd = :odometerAtEnd"),
    @NamedQuery(name = "DriverLogRecord.findByFuelTankReadingTransporter", query = "SELECT d FROM DriverLogRecord d WHERE d.fuelTankReadingTransporter = :fuelTankReadingTransporter"),
    @NamedQuery(name = "DriverLogRecord.findByFuelTankReadingDepot", query = "SELECT d FROM DriverLogRecord d WHERE d.fuelTankReadingDepot = :fuelTankReadingDepot"),
    @NamedQuery(name = "DriverLogRecord.findByTransporterDepartureTime", query = "SELECT d FROM DriverLogRecord d WHERE d.transporterDepartureTime = :transporterDepartureTime"),
    @NamedQuery(name = "DriverLogRecord.findByTransporterArrivalTime", query = "SELECT d FROM DriverLogRecord d WHERE d.transporterArrivalTime = :transporterArrivalTime"),
    @NamedQuery(name = "DriverLogRecord.findByDepotDepartureTime", query = "SELECT d FROM DriverLogRecord d WHERE d.depotDepartureTime = :depotDepartureTime"),
    @NamedQuery(name = "DriverLogRecord.findByDepotArrivalTime", query = "SELECT d FROM DriverLogRecord d WHERE d.depotArrivalTime = :depotArrivalTime")})
public class DriverLogRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer driverLogRecordID;
    @Basic(optional = false)
    @NotNull
    private int odometerAtStart;
    private Integer odometerAtEnd;
    @Basic(optional = false)
    @NotNull
    private int fuelTankReadingTransporter;
    private Integer fuelTankReadingDepot;
    @Temporal(TemporalType.TIMESTAMP)
    private Date transporterDepartureTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date transporterArrivalTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date depotDepartureTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date depotArrivalTime;
    @JoinColumn(name = "orderScheduleID", referencedColumnName = "orderScheduleID")
    @ManyToOne(optional = false)
    private OrderSchedule orderSchedule;
    @JoinColumn(name = "driverID", referencedColumnName = "driverID")
    @ManyToOne(optional = false)
    private Driver driver;
    @JoinColumn(name = "tankerID", referencedColumnName = "tankerID")
    @ManyToOne(optional = true)
    private Tanker tanker;
    @JoinColumn(name = "depotID", referencedColumnName = "depotID")
    @ManyToOne(optional = false)
    private Depot depot;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driverLogRecord")
    private List<DriverDelivery> driverDeliveryList;

    public DriverLogRecord() {
    }

    public DriverLogRecord(Integer driverLogRecordID) {
        this.driverLogRecordID = driverLogRecordID;
    }

    public DriverLogRecord(Integer driverLogRecordID, int odometerAtStart, int fuelTankReadingTransporter) {
        this.driverLogRecordID = driverLogRecordID;
        this.odometerAtStart = odometerAtStart;
        this.fuelTankReadingTransporter = fuelTankReadingTransporter;
    }

    public Integer getDriverLogRecordID() {
        return driverLogRecordID;
    }

    public void setDriverLogRecordID(Integer driverLogRecordID) {
        this.driverLogRecordID = driverLogRecordID;
    }

    public int getOdometerAtStart() {
        return odometerAtStart;
    }

    public void setOdometerAtStart(int odometerAtStart) {
        this.odometerAtStart = odometerAtStart;
    }

    public Integer getOdometerAtEnd() {
        return odometerAtEnd;
    }

    public void setOdometerAtEnd(Integer odometerAtEnd) {
        this.odometerAtEnd = odometerAtEnd;
    }

    public int getFuelTankReadingTransporter() {
        return fuelTankReadingTransporter;
    }

    public void setFuelTankReadingTransporter(int fuelTankReadingTransporter) {
        this.fuelTankReadingTransporter = fuelTankReadingTransporter;
    }

    public Integer getFuelTankReadingDepot() {
        return fuelTankReadingDepot;
    }

    public void setFuelTankReadingDepot(Integer fuelTankReadingDepot) {
        this.fuelTankReadingDepot = fuelTankReadingDepot;
    }

    public Date getTransporterDepartureTime() {
        return transporterDepartureTime;
    }

    public void setTransporterDepartureTime(Date transporterDepartureTime) {
        this.transporterDepartureTime = transporterDepartureTime;
    }

    public Date getTransporterArrivalTime() {
        return transporterArrivalTime;
    }

    public void setTransporterArrivalTime(Date transporterArrivalTime) {
        this.transporterArrivalTime = transporterArrivalTime;
    }

    public Date getDepotDepartureTime() {
        return depotDepartureTime;
    }

    public void setDepotDepartureTime(Date depotDepartureTime) {
        this.depotDepartureTime = depotDepartureTime;
    }

    public Date getDepotArrivalTime() {
        return depotArrivalTime;
    }

    public void setDepotArrivalTime(Date depotArrivalTime) {
        this.depotArrivalTime = depotArrivalTime;
    }

    public OrderSchedule getOrderSchedule() {
        return orderSchedule;
    }

    public void setOrderSchedule(OrderSchedule orderSchedule) {
        this.orderSchedule = orderSchedule;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Tanker getTanker() {
        return tanker;
    }

    public void setTanker(Tanker tanker) {
        this.tanker = tanker;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }

   

    public List<DriverDelivery> getDriverDeliveryList() {
        return driverDeliveryList;
    }

    public void setDriverDeliveryList(List<DriverDelivery> driverDeliveryList) {
        this.driverDeliveryList = driverDeliveryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverLogRecordID != null ? driverLogRecordID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverLogRecord)) {
            return false;
        }
        DriverLogRecord other = (DriverLogRecord) object;
        if ((this.driverLogRecordID == null && other.driverLogRecordID != null) || (this.driverLogRecordID != null && !this.driverLogRecordID.equals(other.driverLogRecordID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DriverLogRecord[ driverLogRecordID=" + driverLogRecordID + " ]";
    }
    
}
