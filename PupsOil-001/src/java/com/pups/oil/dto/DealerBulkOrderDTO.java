/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.DealerBulkOrder;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class DealerBulkOrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer dealerBulkOrderID;
    private long dateCreated;
    private long dateApproved;

    private DriverDeliveryDTO driverDelivery;
    private DealerBulkOrderStatusDTO dealerBulkOrderStatus;
    private TransporterCompanyDTO transporterCompany;
    private DepotDTO depot;

    private DealerCompanyDTO dealerCompany;
    private List<BulkOrderLineItemDTO> bulkOrderLineItemList;
    private List<OrderScheduleDTO> orderScheduleList;

    public DealerBulkOrderDTO() {
    }

    public DealerBulkOrderDTO(DealerBulkOrder a) {
        this.dealerBulkOrderID = a.getDealerBulkOrderID();
        dateCreated = a.getDateCreated().getTime();
        if (a.getDealerCompany() != null) {
            dealerCompany = new DealerCompanyDTO(a.getDealerCompany());
        }
        if (getDealerBulkOrderStatus() != null) {
            dealerBulkOrderStatus = new DealerBulkOrderStatusDTO(a.getDealerBulkOrderStatus());
        }
        if (a.getDateApproved() != null) {
            dateApproved = a.getDateApproved().getTime();
        }
        if (a.getDriverDelivery() != null) {
            driverDelivery = new DriverDeliveryDTO(a.getDriverDelivery());
        }
        if (a.getDepot() != null) {
            depot = new DepotDTO(a.getDepot());
        }
    }

   

    public Integer getDealerBulkOrderID() {
        return dealerBulkOrderID;
    }

    public void setDealerBulkOrderID(Integer dealerBulkOrderID) {
        this.dealerBulkOrderID = dealerBulkOrderID;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(long dateApproved) {
        this.dateApproved = dateApproved;
    }

    public DriverDeliveryDTO getDriverDelivery() {
        return driverDelivery;
    }

    public void setDriverDelivery(DriverDeliveryDTO driverDelivery) {
        this.driverDelivery = driverDelivery;
    }

    public DealerBulkOrderStatusDTO getDealerBulkOrderStatus() {
        return dealerBulkOrderStatus;
    }

    public void setDealerBulkOrderStatus(DealerBulkOrderStatusDTO dealerBulkOrderStatus) {
        this.dealerBulkOrderStatus = dealerBulkOrderStatus;
    }

    public TransporterCompanyDTO getTransporterCompany() {
        return transporterCompany;
    }

    public void setTransporterCompany(TransporterCompanyDTO transporterCompany) {
        this.transporterCompany = transporterCompany;
    }

    public DepotDTO getDepot() {
        return depot;
    }

    public void setDepot(DepotDTO depot) {
        this.depot = depot;
    }

    public DealerCompanyDTO getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompanyDTO dealerCompany) {
        this.dealerCompany = dealerCompany;
    }

    public List<BulkOrderLineItemDTO> getBulkOrderLineItemList() {
        return bulkOrderLineItemList;
    }

    public void setBulkOrderLineItemList(List<BulkOrderLineItemDTO> bulkOrderLineItemList) {
        this.bulkOrderLineItemList = bulkOrderLineItemList;
    }

    public List<OrderScheduleDTO> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderScheduleDTO> orderScheduleList) {
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
        if (!(object instanceof DealerBulkOrderDTO)) {
            return false;
        }
        DealerBulkOrderDTO other = (DealerBulkOrderDTO) object;
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
