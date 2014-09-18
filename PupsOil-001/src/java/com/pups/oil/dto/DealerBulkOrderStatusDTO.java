/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pups.oil.dto;

import com.pups.oil.data.DealerBulkOrderStatus;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class DealerBulkOrderStatusDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer dealerBulkOrderStatusID;
    private String status;

    public DealerBulkOrderStatusDTO() {
    }

    public DealerBulkOrderStatusDTO(DealerBulkOrderStatus a) {
        this.dealerBulkOrderStatusID = a.getDealerBulkOrderStatusID();
        status = a.getStatus();
    }

    public DealerBulkOrderStatusDTO(Integer dealerBulkOrderStatusID, String status) {
        this.dealerBulkOrderStatusID = dealerBulkOrderStatusID;
        this.status = status;
    }

    public Integer getDealerBulkOrderStatusID() {
        return dealerBulkOrderStatusID;
    }

    public void setDealerBulkOrderStatusID(Integer dealerBulkOrderStatusID) {
        this.dealerBulkOrderStatusID = dealerBulkOrderStatusID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dealerBulkOrderStatusID != null ? dealerBulkOrderStatusID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DealerBulkOrderStatusDTO)) {
            return false;
        }
        DealerBulkOrderStatusDTO other = (DealerBulkOrderStatusDTO) object;
        if ((this.dealerBulkOrderStatusID == null && other.dealerBulkOrderStatusID != null) || (this.dealerBulkOrderStatusID != null && !this.dealerBulkOrderStatusID.equals(other.dealerBulkOrderStatusID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.DealerBulkOrderStatus[ dealerBulkOrderStatusID=" + dealerBulkOrderStatusID + " ]";
    }

}
