package com.parkauto.rest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LOCATION")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDLOCATION")
    private Long idLocation;

    @Column(name = "DATELOCATION")
    private String dateLocation;

    @Column(name = "DATERETOURLOCATION")
    private String dateRetourLocation;

    @Column(name = "DATEDEBUTLOCATION")
    private String dateDebutLocation;

    @ManyToMany
    @JoinTable(name="LOCATION_CLIENT")
    private List<Client> clientList;

    public Location() {
    }

    public Location(Long idLocation, String dateLocation, String dateRetourLocation, String dateDebutLocation, List<Client> clientList) {
        this.idLocation = idLocation;
        this.dateLocation = dateLocation;
        this.dateRetourLocation = dateRetourLocation;
        this.dateDebutLocation = dateDebutLocation;
        this.clientList = clientList;
    }

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public String getDateLocation() {
        return dateLocation;
    }

    public void setDateLocation(String dateLocation) {
        this.dateLocation = dateLocation;
    }

    public String getDateRetourLocation() {
        return dateRetourLocation;
    }

    public void setDateRetourLocation(String dateRetourLocation) {
        this.dateRetourLocation = dateRetourLocation;
    }

    public String getDateDebutLocation() {
        return dateDebutLocation;
    }

    public void setDateDebutLocation(String dateDebutLocation) {
        this.dateDebutLocation = dateDebutLocation;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
