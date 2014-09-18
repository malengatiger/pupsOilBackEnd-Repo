/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.DriverLogRecord;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DriverLogRecordDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer driverLogRecordID;
    private int odometerAtStart;
    private int odometerAtEnd;
    private int fuelTankReadingTransporter;
    private int fuelTankReadingDepot;
    private long transporterDepartureTime;
    private long transporterArrivalTime;
    private long depotDepartureTime;
    private long depotArrivalTime;
    private OrderScheduleDTO orderSchedule;
    private DriverDTO driver;
    private TankerDTO tanker;
    private DepotDTO depot;
    private List<DriverDeliveryDTO> driverDeliveryList;

    public DriverLogRecordDTO() {
    }

    public DriverLogRecordDTO(Integer driverLogRecordID) {
        this.driverLogRecordID = driverLogRecordID;
    }

    public DriverLogRecordDTO(DriverLogRecord a) {
        this.driverLogRecordID = a.getDriverLogRecordID();
        this.odometerAtStart = a.getOdometerAtStart();
        this.odometerAtEnd = a.getOdometerAtEnd();
        this.orderSchedule = new OrderScheduleDTO(a.getOrderSchedule());
        this.fuelTankReadingTransporter = a.getFuelTankReadingTransporter();
        this.fuelTankReadingDepot = a.getFuelTankReadingDepot();
        this.driver = new DriverDTO(a.getDriver());
        this.depot = new DepotDTO(a.getDepot());
        this.orderSchedule = new OrderScheduleDTO(a.getOrderSchedule());
        if (a.getTanker() != null) {
            this.tanker = new TankerDTO(a.getTanker());
        }
        if (a.getTransporterArrivalTime() != null) {
            this.transporterArrivalTime = a.getTransporterArrivalTime().getTime();
        }
        if (a.getTransporterDepartureTime() != null) {
            this.transporterDepartureTime = a.getTransporterDepartureTime().getTime();
        }
        if (a.getDepotArrivalTime() != null) {
            this.depotArrivalTime = a.getDepotArrivalTime().getTime();
        }
        if (a.getDepotDepartureTime() != null) {
            this.depotDepartureTime = a.getDepotDepartureTime().getTime();
        }
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

  
    public void setOdometerAtEnd(int odometerAtEnd) {
        this.odometerAtEnd = odometerAtEnd;
    }


    public void setFuelTankReadingDepot(int fuelTankReadingDepot) {
        this.fuelTankReadingDepot = fuelTankReadingDepot;
    }

    public long getTransporterDepartureTime() {
        return transporterDepartureTime;
    }

    public void setTransporterDepartureTime(long transporterDepartureTime) {
        this.transporterDepartureTime = transporterDepartureTime;
    }

    public long getTransporterArrivalTime() {
        return transporterArrivalTime;
    }

    public void setTransporterArrivalTime(long transporterArrivalTime) {
        this.transporterArrivalTime = transporterArrivalTime;
    }

    public long getDepotDepartureTime() {
        return depotDepartureTime;
    }

    public void setDepotDepartureTime(long depotDepartureTime) {
        this.depotDepartureTime = depotDepartureTime;
    }

    public long getDepotArrivalTime() {
        return depotArrivalTime;
    }

    public void setDepotArrivalTime(long depotArrivalTime) {
        this.depotArrivalTime = depotArrivalTime;
    }

    

    public OrderScheduleDTO getOrderSchedule() {
        return orderSchedule;
    }

    public void setOrderSchedule(OrderScheduleDTO orderSchedule) {
        this.orderSchedule = orderSchedule;
    }

    public DriverDTO getDriver() {
        return driver;
    }

    public void setDriver(DriverDTO driver) {
        this.driver = driver;
    }

    public TankerDTO getTanker() {
        return tanker;
    }

    public void setTanker(TankerDTO tanker) {
        this.tanker = tanker;
    }

    public DepotDTO getDepot() {
        return depot;
    }

    public void setDepot(DepotDTO depot) {
        this.depot = depot;
    }

    public List<DriverDeliveryDTO> getDriverDeliveryList() {
        return driverDeliveryList;
    }

    public void setDriverDeliveryList(List<DriverDeliveryDTO> driverDeliveryList) {
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
        if (!(object instanceof DriverLogRecordDTO)) {
            return false;
        }
        DriverLogRecordDTO other = (DriverLogRecordDTO) object;
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
