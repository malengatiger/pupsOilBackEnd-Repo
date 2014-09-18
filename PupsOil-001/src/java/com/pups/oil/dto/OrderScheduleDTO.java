/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.OrderSchedule;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class OrderScheduleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer orderScheduleID;
    private DealerBulkOrderDTO dealerBulkOrder;
    private DriverDTO driver;
    private Integer transporterCompanyID;
    private List<DriverLogRecordDTO> driverLogRecordList;

    public OrderScheduleDTO() {
    }

    public OrderScheduleDTO(OrderSchedule a) {
        this.orderScheduleID = a.getOrderScheduleID();
        dealerBulkOrder = new DealerBulkOrderDTO(a.getDealerBulkOrder());
        driver = new DriverDTO(a.getDriver());
        transporterCompanyID = a.getTransporterCompany().getTransporterCompanyID();
    }

    public Integer getTransporterCompanyID() {
        return transporterCompanyID;
    }

    public void setTransporterCompanyID(Integer transporterCompanyID) {
        this.transporterCompanyID = transporterCompanyID;
    }

    public Integer getOrderScheduleID() {
        return orderScheduleID;
    }

    public void setOrderScheduleID(Integer orderScheduleID) {
        this.orderScheduleID = orderScheduleID;
    }

    public DealerBulkOrderDTO getDealerBulkOrder() {
        return dealerBulkOrder;
    }

    public void setDealerBulkOrder(DealerBulkOrderDTO dealerBulkOrder) {
        this.dealerBulkOrder = dealerBulkOrder;
    }

    public DriverDTO getDriver() {
        return driver;
    }

    public void setDriver(DriverDTO driver) {
        this.driver = driver;
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
        hash += (orderScheduleID != null ? orderScheduleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderScheduleDTO)) {
            return false;
        }
        OrderScheduleDTO other = (OrderScheduleDTO) object;
        if ((this.orderScheduleID == null && other.orderScheduleID != null) || (this.orderScheduleID != null && !this.orderScheduleID.equals(other.orderScheduleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.OrderSchedule[ orderScheduleID=" + orderScheduleID + " ]";
    }

}
