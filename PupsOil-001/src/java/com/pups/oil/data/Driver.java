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
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d"),
    @NamedQuery(name = "Driver.findByDriverID", query = "SELECT d FROM Driver d WHERE d.driverID = :driverID"),
    @NamedQuery(name = "Driver.findByFirstName", query = "SELECT d FROM Driver d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "Driver.findByLastName", query = "SELECT d FROM Driver d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "Driver.findByCellphone", query = "SELECT d FROM Driver d WHERE d.cellphone = :cellphone"),
    @NamedQuery(name = "Driver.findByEmail", query = "SELECT d FROM Driver d WHERE d.email = :email"),
    @NamedQuery(name = "Driver.findByDateRegistered", query = "SELECT d FROM Driver d WHERE d.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Driver.findByActiveFlag", query = "SELECT d FROM Driver d WHERE d.activeFlag = :activeFlag"),
    @NamedQuery(name = "Driver.findByGender", query = "SELECT d FROM Driver d WHERE d.gender = :gender"),
    @NamedQuery(name = "Driver.findByIDNumber", query = "SELECT d FROM Driver d WHERE d.iDNumber = :iDNumber")})
public class Driver implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer driverID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String cellphone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    private int activeFlag;
    @Basic(optional = false)
    @NotNull
    private int gender;
    @Size(max = 45)
    private String iDNumber;
    @JoinColumn(name = "transporterCompanyID", referencedColumnName = "transporterCompanyID")
    @ManyToOne(optional = false)
    private TransporterCompany transporterCompany;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    private List<DriverTracker> driverTrackerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    private List<OrderSchedule> orderScheduleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    private List<DriverLogRecord> driverLogRecordList;

    public Driver() {
    }

    public Driver(Integer driverID) {
        this.driverID = driverID;
    }

    public Driver(Integer driverID, String firstName, String lastName, String cellphone, String email, Date dateRegistered, int activeFlag, int gender) {
        this.driverID = driverID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.activeFlag = activeFlag;
        this.gender = gender;
    }

    public Integer getDriverID() {
        return driverID;
    }

    public void setDriverID(Integer driverID) {
        this.driverID = driverID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public TransporterCompany getTransporterCompany() {
        return transporterCompany;
    }

    public void setTransporterCompany(TransporterCompany transporterCompany) {
        this.transporterCompany = transporterCompany;
    }

 

    public List<DriverTracker> getDriverTrackerList() {
        return driverTrackerList;
    }

    public void setDriverTrackerList(List<DriverTracker> driverTrackerList) {
        this.driverTrackerList = driverTrackerList;
    }

    public List<OrderSchedule> getOrderScheduleList() {
        return orderScheduleList;
    }

    public void setOrderScheduleList(List<OrderSchedule> orderScheduleList) {
        this.orderScheduleList = orderScheduleList;
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
        hash += (driverID != null ? driverID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.driverID == null && other.driverID != null) || (this.driverID != null && !this.driverID.equals(other.driverID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Driver[ driverID=" + driverID + " ]";
    }
    
}
