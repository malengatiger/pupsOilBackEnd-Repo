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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Tanker.findAll", query = "SELECT t FROM Tanker t"),
    @NamedQuery(name = "Tanker.findByTankerID", query = "SELECT t FROM Tanker t WHERE t.tankerID = :tankerID"),
    @NamedQuery(name = "Tanker.findByTankerMake", query = "SELECT t FROM Tanker t WHERE t.tankerMake = :tankerMake"),
    @NamedQuery(name = "Tanker.findByTankerModel", query = "SELECT t FROM Tanker t WHERE t.tankerModel = :tankerModel"),
    @NamedQuery(name = "Tanker.findByRegistrationNumber", query = "SELECT t FROM Tanker t WHERE t.registrationNumber = :registrationNumber"),
    @NamedQuery(name = "Tanker.findByRoadworthyCertificate", query = "SELECT t FROM Tanker t WHERE t.roadworthyCertificate = :roadworthyCertificate"),
    @NamedQuery(name = "Tanker.findByLatitude", query = "SELECT t FROM Tanker t WHERE t.latitude = :latitude"),
    @NamedQuery(name = "Tanker.findByLongitude", query = "SELECT t FROM Tanker t WHERE t.longitude = :longitude")})
public class Tanker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer tankerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String tankerMake;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String tankerModel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String registrationNumber;
    @Size(max = 45)
    private String roadworthyCertificate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double latitude;
    private Double longitude;
    @JoinColumn(name = "transporterCompanyID", referencedColumnName = "transporterCompanyID")
    @ManyToOne(optional = false)
    private TransporterCompany transporterCompany;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tanker")
    private List<DriverLogRecord> driverLogRecordList;

    public Tanker() {
    }

    public Tanker(Integer tankerID) {
        this.tankerID = tankerID;
    }

    public Tanker(Integer tankerID, String tankerMake, String tankerModel, String registrationNumber) {
        this.tankerID = tankerID;
        this.tankerMake = tankerMake;
        this.tankerModel = tankerModel;
        this.registrationNumber = registrationNumber;
    }

    public Integer getTankerID() {
        return tankerID;
    }

    public void setTankerID(Integer tankerID) {
        this.tankerID = tankerID;
    }

    public String getTankerMake() {
        return tankerMake;
    }

    public void setTankerMake(String tankerMake) {
        this.tankerMake = tankerMake;
    }

    public String getTankerModel() {
        return tankerModel;
    }

    public void setTankerModel(String tankerModel) {
        this.tankerModel = tankerModel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRoadworthyCertificate() {
        return roadworthyCertificate;
    }

    public void setRoadworthyCertificate(String roadworthyCertificate) {
        this.roadworthyCertificate = roadworthyCertificate;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
        hash += (tankerID != null ? tankerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tanker)) {
            return false;
        }
        Tanker other = (Tanker) object;
        if ((this.tankerID == null && other.tankerID != null) || (this.tankerID != null && !this.tankerID.equals(other.tankerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pupsoil.data.Tanker[ tankerID=" + tankerID + " ]";
    }
    
}
