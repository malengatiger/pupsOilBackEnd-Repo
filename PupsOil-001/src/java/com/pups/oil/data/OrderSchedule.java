/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.data;

import java.io.Serializable;
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

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "OrderSchedule.findAll", query = "SELECT o FROM OrderSchedule o"),
    @NamedQuery(name = "OrderSchedule.findByOrderScheduleID", query = "SELECT o FROM OrderSchedule o WHERE o.orderScheduleID = :orderScheduleID")})
public class OrderSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer orderScheduleID;
    @JoinColumn(name = "dealerBulkOrderID", referencedColumnName = "dealerCompanyID")
    @ManyToOne(optional = false)
    private DealerBulkOrder dealerBulkOrder;
    @JoinColumn(name = "driverID", referencedColumnName = "driverID")
    @ManyToOne(optional = false)
    private Driver driver;
    @JoinColumn(name = "transporterCompanyID", referencedColumnName = "transporterCompanyID")
    @ManyToOne(optional = false)
    private TransporterCompany transporterCompany;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderSchedule")
    private List<DriverLogRecord> driverLogRecordList;

    public OrderSchedule() {
    }

    public OrderSchedule(Integer orderScheduleID) {
        this.orderScheduleID = orderScheduleID;
    }

    public Integer getOrderScheduleID() {
        return orderScheduleID;
    }

    public void setOrderScheduleID(Integer orderScheduleID) {
        this.orderScheduleID = orderScheduleID;
    }

    public DealerBulkOrder getDealerBulkOrder() {
        return dealerBulkOrder;
    }

    public void setDealerBulkOrder(DealerBulkOrder dealerBulkOrder) {
        this.dealerBulkOrder = dealerBulkOrder;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public TransporterCompany getTransporterCompany() {
        return transporterCompany;
    }

    public void setTransporterCompany(TransporterCompany transporterCompany) {
        this.transporterCompany = transporterCompany;
    }


    public List<DriverLogRecord> getDriverLogRecordList() {
        return driverLogRecordList;
    }

    public void setDriverLogRecordList(List<DriverLogRecord> driverLogRecordList) {
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
        if (!(object instanceof OrderSchedule)) {
            return false;
        }
        OrderSchedule other = (OrderSchedule) object;
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
