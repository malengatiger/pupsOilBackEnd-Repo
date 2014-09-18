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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "DealerBulkOrderStatus.findAll", query = "SELECT d FROM DealerBulkOrderStatus d"),
    @NamedQuery(name = "DealerBulkOrderStatus.findByDealerBulkOrderStatusID", query = "SELECT d FROM DealerBulkOrderStatus d WHERE d.dealerBulkOrderStatusID = :dealerBulkOrderStatusID"),
    @NamedQuery(name = "DealerBulkOrderStatus.findByStatus", query = "SELECT d FROM DealerBulkOrderStatus d WHERE d.status = :status")})
public class DealerBulkOrderStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer dealerBulkOrderStatusID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dealerBulkOrderStatus")
    private List<DealerBulkOrder> dealerBulkOrderList;

    public DealerBulkOrderStatus() {
    }

    public DealerBulkOrderStatus(Integer dealerBulkOrderStatusID) {
        this.dealerBulkOrderStatusID = dealerBulkOrderStatusID;
    }

    public DealerBulkOrderStatus(Integer dealerBulkOrderStatusID, String status) {
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

    public List<DealerBulkOrder> getDealerBulkOrderList() {
        return dealerBulkOrderList;
    }

    public void setDealerBulkOrderList(List<DealerBulkOrder> dealerBulkOrderList) {
        this.dealerBulkOrderList = dealerBulkOrderList;
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
        if (!(object instanceof DealerBulkOrderStatus)) {
            return false;
        }
        DealerBulkOrderStatus other = (DealerBulkOrderStatus) object;
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
