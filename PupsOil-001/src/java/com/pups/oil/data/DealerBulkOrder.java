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
    @NamedQuery(name = "DealerBulkOrder.findAll", query = "SELECT d FROM DealerBulkOrder d"),
    @NamedQuery(name = "DealerBulkOrder.findByDealerBulkOrderID", query = "SELECT d FROM DealerBulkOrder d WHERE d.dealerBulkOrderID = :dealerBulkOrderID"),
    @NamedQuery(name = "DealerBulkOrder.findByDateCreated", query = "SELECT d FROM DealerBulkOrder d WHERE d.dateCreated = :dateCreated"),
    @NamedQuery(name = "DealerBulkOrder.findByDateApproved", query = "SELECT d FROM DealerBulkOrder d WHERE d.dateApproved = :dateApproved")})
public class DealerBulkOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer dealerBulkOrderID;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApproved;
    @JoinColumn(name = "driverDeliveryID", referencedColumnName = "driverDeliveryID")
    @ManyToOne
    private DriverDelivery driverDelivery;
    @JoinColumn(name = "dealerBulkOrderStatusID", referencedColumnName = "dealerBulkOrderStatusID")
    @ManyToOne(optional = false)
    private DealerBulkOrderStatus dealerBulkOrderStatus;
    @JoinColumn(name = "transporterCompanyID", referencedColumnName = "transporterCompanyID")
    @ManyToOne(optional = false)
    private TransporterCompany transporterCompany;
    @JoinColumn(name = "depotID", referencedColumnName = "depotID")
    @ManyToOne(optional = false)
    private Depot depot;
    @JoinColumn(name = "dealerCompanyID", referencedColumnName = "dealerCompanyID")
    @ManyToOne(optional = false)
    private DealerCompany dealerCompany;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerBulkOrder")
    private List<BulkOrderLineItem> bulkOrderLineItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerBulkOrder")
    private List<OrderSchedule> orderScheduleList;

    public DealerBulkOrder() {
    }

    public DealerBulkOrder(Integer dealerBulkOrderID) {
        this.dealerBulkOrderID = dealerBulkOrderID;
    }

    public DealerBulkOrder(Integer dealerBulkOrderID, Date dateCreated) {
        this.dealerBulkOrderID = dealerBulkOrderID;
        this.dateCreated = dateCreated;
    }

    public Integer getDealerBulkOrderID() {
        return dealerBulkOrderID;
    }

    public void setDealerBulkOrderID(Integer dealerBulkOrderID) {
        this.dealerBulkOrderID = dealerBulkOrderID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public DriverDelivery getDriverDelivery() {
        return driverDelivery;
    }

    public void setDriverDelivery(DriverDelivery driverDelivery) {
        this.driverDelivery = driverDelivery;
    }

    public DealerBulkOrderStatus getDealerBulkOrderStatus() {
        return dealerBulkOrderStatus;
    }

    public void setDealerBulkOrderStatus(DealerBulkOrderStatus dealerBulkOrderStatus) {
        this.dealerBulkOrderStatus = dealerBulkOrderStatus;
    }

    public TransporterCompany getTransporterCompany() {
        return transporterCompany;
    }

    public void setTransporterCompany(TransporterCompany transporterCompany) {
        this.transporterCompany = transporterCompany;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }

    public DealerCompany getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompany dealerCompany) {
        this.dealerCompany = dealerCompany;
    }


    public List<BulkOrderLineItem> getBulkOrderLineItemList() {
        return bulkOrderLineItemList;
    }

    public void setBulkOrderLineItemList(List<BulkOrderLineItem> bulkOrderLineItemList) {
        this.bulkOrderLineItemList = bulkOrderLineItemList;
    }

    public List<OrderSchedule> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderSchedule> orderScheduleList) {
        this.orderScheduleList = orderScheduleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerBulkOrderID != null ? dealerBulkOrderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DealerBulkOrder)) {
            return false;
        }
        DealerBulkOrder other = (DealerBulkOrder) object;
        if ((this.dealerBulkOrderID == null && other.dealerBulkOrderID != null) || (this.dealerBulkOrderID != null && !this.dealerBulkOrderID.equals(other.dealerBulkOrderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DealerBulkOrder[ dealerBulkOrderID=" + dealerBulkOrderID + " ]";
    }
    
}
