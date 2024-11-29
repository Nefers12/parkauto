package com.parkauto.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTS")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCLIENT")
    private Long idClient;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "CODEPOSTAL")
    private String codePostal;

    @Column(name = "VILLE")
    private String ville;

    @Column(name = "PAYS")
    private String pays;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    public Client() {
        super();
    }

    public Client(Long idClient, Vehicule vehicule, String pays, String ville, String codePostal, String adresse, String prenom, String nom) {
        this.idClient = idClient;
        this.vehicule = vehicule;
        this.pays = pays;
        this.ville = ville;
        this.codePostal = codePostal;
        this.adresse = adresse;
        this.prenom = prenom;
        this.nom = nom;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}
