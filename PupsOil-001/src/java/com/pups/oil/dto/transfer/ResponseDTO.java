/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.dto.transfer;

import com.pups.oil.dto.DealerBulkOrderDTO;
import com.pups.oil.dto.DealerBulkOrderStatusDTO;
import com.pups.oil.dto.DealerCompanyDTO;
import com.pups.oil.dto.DealerCompanyStaffDTO;
import com.pups.oil.dto.DepotDTO;
import com.pups.oil.dto.DriverDTO;
import com.pups.oil.dto.DriverDeliveryDTO;
import com.pups.oil.dto.DriverLogRecordDTO;
import com.pups.oil.dto.DriverTrackerDTO;
import com.pups.oil.dto.OrderScheduleDTO;
import com.pups.oil.dto.ProductDTO;
import com.pups.oil.dto.ProvinceDTO;
import com.pups.oil.dto.RetailerCompanyDTO;
import com.pups.oil.dto.RetailerDTO;
import com.pups.oil.dto.RetailerDeliveryConfirmationDTO;
import com.pups.oil.dto.RetailerPurchaseOrderDTO;
import com.pups.oil.dto.RetailerStaffDTO;
import com.pups.oil.dto.TankerDTO;
import com.pups.oil.dto.TransporterCompanyDTO;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the format of all responses from PupsOil BackEnd
 * All data that is sent to the requestor will be in a JSON string of this format.
 * Depending on the request type, some fields will be null
 * @author aubreyM
 */
public class ResponseDTO {
  
    private int statusCode;
    private String message = "Request completed successfully",
            sessionID;
    private List<DealerBulkOrderDTO> dealerBulkOrderList = new ArrayList();
    private List<DealerCompanyDTO> dealerCompanyList = new ArrayList();
    private List<RetailerCompanyDTO> retailerCompanyList = new ArrayList();
    private List<RetailerDTO> retailerList = new ArrayList();
    private List<TransporterCompanyDTO> transporterCompanyList = new ArrayList();
    private List<DriverDTO> driverList = new ArrayList();
    private List<DealerCompanyStaffDTO> dealerCompanyStaffList = new ArrayList();
    private List<RetailerStaffDTO> retailerStaffList = new ArrayList();
    private List<ProvinceDTO> provinceList = new ArrayList();   
    private List<DriverLogRecordDTO> driverLogRecordList = new ArrayList();
    private List<ProductDTO> productList = new ArrayList();
    private List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList = new ArrayList();
    private List<OrderScheduleDTO> orderScheduleList = new ArrayList();
    private List<TankerDTO> tankerList = new ArrayList();
    private List<DepotDTO> depotList = new ArrayList();
    private List<DriverDeliveryDTO> driverDeliveryList = new ArrayList();
    private List<DriverTrackerDTO> driverTrackerList = new ArrayList();
    private List<DealerBulkOrderStatusDTO> dealerBulkOrderStatusList = new ArrayList();
    private List<RetailerDeliveryConfirmationDTO> retailerDeliveryConfirmationList = new ArrayList();

    //
    
    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DealerBulkOrderDTO> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrderDTO> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
    }

    public List<DealerCompanyDTO> getDealerCompanyList() {
        return dealerCompanyList;
    }

    public void setDealerCompanyList(List<DealerCompanyDTO> dealerCompanyList) {
        this.dealerCompanyList = dealerCompanyList;
    }

    public List<RetailerCompanyDTO> getRetailerCompanyList() {
        return retailerCompanyList;
    }

    public void setRetailerCompanyList(List<RetailerCompanyDTO> retailerCompanyList) {
        this.retailerCompanyList = retailerCompanyList;
    }

    public List<RetailerDTO> getRetailerList() {
        return retailerList;
    }

    public void setRetailerList(List<RetailerDTO> retailerList) {
        this.retailerList = retailerList;
    }

    public List<TransporterCompanyDTO> getTransporterCompanyList() {
        return transporterCompanyList;
    }

    public void setTransporterCompanyList(List<TransporterCompanyDTO> transporterCompanyList) {
        this.transporterCompanyList = transporterCompanyList;
    }

    public List<DriverDTO> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<DriverDTO> driverList) {
        this.driverList = driverList;
    }

    public List<DealerCompanyStaffDTO> getDealerCompanyStaffList() {
        return dealerCompanyStaffList;
    }

    public void setDealerCompanyStaffList(List<DealerCompanyStaffDTO> dealerCompanyStaffList) {
        this.dealerCompanyStaffList = dealerCompanyStaffList;
    }

    public List<RetailerStaffDTO> getRetailerStaffList() {
        return retailerStaffList;
    }

    public void setRetailerStaffList(List<RetailerStaffDTO> retailerStaffList) {
        this.retailerStaffList = retailerStaffList;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    public List<DriverLogRecordDTO> getDriverLogRecordList() {
        return driverLogRecordList;
    }

    public void setDriverLogRecordList(List<DriverLogRecordDTO> driverLogRecordList) {
        this.driverLogRecordList = driverLogRecordList;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }

    public List<RetailerPurchaseOrderDTO> getRetailerPurchaseOrderList() {
        return retailerPurchaseOrderList;
    }

    public void setRetailerPurchaseOrderList(List<RetailerPurchaseOrderDTO> retailerPurchaseOrderList) {
        this.retailerPurchaseOrderList = retailerPurchaseOrderList;
    }

    public List<OrderScheduleDTO> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderScheduleDTO> orderScheduleList) {
        this.orderScheduleList = orderScheduleList;
    }

    public List<TankerDTO> getTankerList() {
        return tankerList;
    }

    public void setTankerList(List<TankerDTO> tankerList) {
        this.tankerList = tankerList;
    }

    public List<DepotDTO> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<DepotDTO> depotList) {
        this.depotList = depotList;
    }

    public List<DriverDeliveryDTO> getDriverDeliveryList() {
        return driverDeliveryList;
    }

    public void setDriverDeliveryList(List<DriverDeliveryDTO> driverDeliveryList) {
        this.driverDeliveryList = driverDeliveryList;
    }

    public List<DriverTrackerDTO> getDriverTrackerList() {
        return driverTrackerList;
    }

    public void setDriverTrackerList(List<DriverTrackerDTO> driverTrackerList) {
        this.driverTrackerList = driverTrackerList;
    }

    public List<DealerBulkOrderStatusDTO> getDealerBulkOrderStatusList() {
        return dealerBulkOrderStatusList;
    }

    public void setDealerBulkOrderStatusList(List<DealerBulkOrderStatusDTO> dealerBulkOrderStatusList) {
        this.dealerBulkOrderStatusList = dealerBulkOrderStatusList;
    }

    public List<RetailerDeliveryConfirmationDTO> getRetailerDeliveryConfirmationList() {
        return retailerDeliveryConfirmationList;
    }

    public void setRetailerDeliveryConfirmationList(List<RetailerDeliveryConfirmationDTO> retailerDeliveryConfirmationList) {
        this.retailerDeliveryConfirmationList = retailerDeliveryConfirmationList;
    }
    
}
