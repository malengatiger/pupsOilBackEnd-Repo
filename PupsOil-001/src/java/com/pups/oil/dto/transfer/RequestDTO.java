/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto.transfer;

import com.pups.oil.data.RetailerCompany;
import com.pups.oil.dto.DealerBulkOrderDTO;
import com.pups.oil.dto.DealerCompanyDTO;
import com.pups.oil.dto.DealerCompanyStaffDTO;
import com.pups.oil.dto.DepotCompanyDTO;
import com.pups.oil.dto.DepotDTO;
import com.pups.oil.dto.DriverDTO;
import com.pups.oil.dto.DriverDeliveryDTO;
import com.pups.oil.dto.DriverLogRecordDTO;
import com.pups.oil.dto.DriverTrackerDTO;
import com.pups.oil.dto.OrderScheduleDTO;
import com.pups.oil.dto.RetailerDeliveryConfirmationDTO;
import com.pups.oil.dto.RetailerPurchaseOrderDTO;
import com.pups.oil.dto.RetailerStaffDTO;
import com.pups.oil.dto.TankerDTO;
import com.pups.oil.dto.TransporterCompanyDTO;
import java.io.Serializable;

/**
 * This class represents the request that comes in via http or websocket
 * It essentially is the API for PupsOil BackEnd Service. 
 * The static int fields are the names of the request types that are accepted by the application
 * @author aubreyM
 */
public class RequestDTO implements Serializable{
    
    //request types that enable the order and delivery process
    public static final int 
            ADD_RETAILER_PURCHASE_ORDER = 100,
            ADD_DEALER_BULK_ORDER = 101,
            ADD_ORDER_SCHEDULE = 102,
            PROCESS_DRIVER_LOG_RECORD = 103,
            PROCESS_DRIVER_DELIVERY = 104,
            ADD_RETAILER_DELIVERY_CONFIRMATION = 105,
            ADD_DRIVER_TRACKER = 106;
      
    //request types to query data from database
    public static final int GET_BULK_ORDERS_BY_DEALER = 200,
            GET_RETAILER_PURCHASE_ORDERS_FOR_DEALER = 201,
            GET_ORDER_SCHEDULES_BY_TRANSPORTER = 202,
            GET_ORDER_SCHEDULES_BY_DRIVER = 203,
            GET_DRIVER_TRACKERS_BY_TRANSPORTER = 204,
            GET_DRIVER_LOG_RECORDS_BY_TRANSPORTER = 205,
            GET_RETAILER_DELIVERY_CONFIRMATIONS = 206;
    
    //request types to register these entities on database
    public static final int REGISTER_DEALER_COMPANY = 1,
            REGISTER_RETAILER_COMPANY = 2,
            REGISTER_RETAILER = 3,
            REGISTER_TRANSPORTER_COMPANY = 4,
            REGISTER_TANKER = 5,
            REGISTER_DRIVER = 6,
            REGISTER_DEALER_COMPANY_STAFF = 7,
            REGISTER_RETAILER_STAFF = 8,
            REGISTER_DEPOT_COMPANY = 9;
    
    private Integer dealerCompanyID, retailerCompanyID, retailerID,
            requestType;
    private DealerCompanyDTO dealerCompany;
    private RetailerPurchaseOrderDTO retailerPurchaseOrder;
    private RetailerCompany retailerCompany;
    private DealerBulkOrderDTO dealerBulkOrder;
    private DriverTrackerDTO driverTracker;
    private DriverDeliveryDTO driverDelivery;
    private RetailerDeliveryConfirmationDTO retailerDeliveryConfirmation;
    private TransporterCompanyDTO transporterCompany;
    private DepotCompanyDTO depotCompany;
    private DealerCompanyStaffDTO dealerCompanyStaff;
    private RetailerStaffDTO retailerStaff;
    private TankerDTO tanker;
    private OrderScheduleDTO orderSchedule;
    private DriverDTO driver;
    private DepotDTO depot;
    private DriverLogRecordDTO driverLogRecord;

    public DealerCompanyStaffDTO getDealerCompanyStaff() {
        return dealerCompanyStaff;
    }

    public void setDealerCompanyStaff(DealerCompanyStaffDTO dealerCompanyStaff) {
        this.dealerCompanyStaff = dealerCompanyStaff;
    }

    public RetailerStaffDTO getRetailerStaff() {
        return retailerStaff;
    }

    public void setRetailerStaff(RetailerStaffDTO retailerStaff) {
        this.retailerStaff = retailerStaff;
    }

    public TankerDTO getTanker() {
        return tanker;
    }

    public void setTanker(TankerDTO tanker) {
        this.tanker = tanker;
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

    public DepotDTO getDepot() {
        return depot;
    }

    public void setDepot(DepotDTO depot) {
        this.depot = depot;
    }

    public DriverLogRecordDTO getDriverLogRecord() {
        return driverLogRecord;
    }

    public void setDriverLogRecord(DriverLogRecordDTO driverLogRecord) {
        this.driverLogRecord = driverLogRecord;
    }
    

    
    public Integer getDealerCompanyID() {
        return dealerCompanyID;
    }

    public void setDealerCompanyID(Integer dealerCompanyID) {
        this.dealerCompanyID = dealerCompanyID;
    }

    public Integer getRetailerCompanyID() {
        return retailerCompanyID;
    }

    public void setRetailerCompanyID(Integer retailerCompanyID) {
        this.retailerCompanyID = retailerCompanyID;
    }

    public Integer getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public DealerCompanyDTO getDealerCompany() {
        return dealerCompany;
    }

    public void setDealerCompany(DealerCompanyDTO dealerCompany) {
        this.dealerCompany = dealerCompany;
    }

    public RetailerPurchaseOrderDTO getRetailerPurchaseOrder() {
        return retailerPurchaseOrder;
    }

    public void setRetailerPurchaseOrder(RetailerPurchaseOrderDTO retailerPurchaseOrder) {
        this.retailerPurchaseOrder = retailerPurchaseOrder;
    }

    public RetailerCompany getRetailerCompany() {
        return retailerCompany;
    }

    public void setRetailerCompany(RetailerCompany retailerCompany) {
        this.retailerCompany = retailerCompany;
    }

    public DealerBulkOrderDTO getDealerBulkOrder() {
        return dealerBulkOrder;
    }

    public void setDealerBulkOrder(DealerBulkOrderDTO dealerBulkOrder) {
        this.dealerBulkOrder = dealerBulkOrder;
    }

    public DriverTrackerDTO getDriverTracker() {
        return driverTracker;
    }

    public void setDriverTracker(DriverTrackerDTO driverTracker) {
        this.driverTracker = driverTracker;
    }

    public DriverDeliveryDTO getDriverDelivery() {
        return driverDelivery;
    }

    public void setDriverDelivery(DriverDeliveryDTO driverDelivery) {
        this.driverDelivery = driverDelivery;
    }

    public RetailerDeliveryConfirmationDTO getRetailerDeliveryConfirmation() {
        return retailerDeliveryConfirmation;
    }

    public void setRetailerDeliveryConfirmation(RetailerDeliveryConfirmationDTO retailerDeliveryConfirmation) {
        this.retailerDeliveryConfirmation = retailerDeliveryConfirmation;
    }

    public TransporterCompanyDTO getTransporterCompany() {
        return transporterCompany;
    }

    public void setTransporterCompany(TransporterCompanyDTO transporterCompany) {
        this.transporterCompany = transporterCompany;
    }

    public DepotCompanyDTO getDepotCompany() {
        return depotCompany;
    }

    public void setDepotCompany(DepotCompanyDTO depotCompany) {
        this.depotCompany = depotCompany;
    }
    
    
}
