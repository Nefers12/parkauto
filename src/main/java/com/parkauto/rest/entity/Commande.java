package com.parkauto.rest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "COMMANDE")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCOMMANDE")
    private Long idCommande;

    @Column(name = "QTECOMMANDE")
    private int qteCommande;

    @Column(name = "DATECOMMANDE")
    private String dateCommande;

    @Column(name = "DESCRIPTIONCOMMANDE")
    private Long descriptionCommande;

    @Column(name = "PRIXCOMMANDE")
    private double prixCommande;

    @Column(name = "PRIXTOTALCOMMAND")
    private double prixTotalCommande;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> ligneCommandes;


    public Commande() {
    }

    public Commande(Long idCommande, int qteCommande, String dateCommande, Long descriptionCommande, double prixCommande, double prixTotalCommande, Client client, List<LigneCommande> ligneCommandes) {
        this.idCommande = idCommande;
        this.qteCommande = qteCommande;
        this.dateCommande = dateCommande;
        this.descriptionCommande = descriptionCommande;
        this.prixCommande = prixCommande;
        this.prixTotalCommande = prixTotalCommande;
        this.client = client;
        this.ligneCommandes = ligneCommandes;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Long getDescriptionCommande() {
        return descriptionCommande;
    }

    public void setDescriptionCommande(Long descriptionCommande) {
        this.descriptionCommande = descriptionCommande;
    }

    public double getPrixCommande() {
        return prixCommande;
    }

    public void setPrixCommande(double prixCommande) {
        this.prixCommande = prixCommande;
    }

    public double getPrixTotalCommande() {
        return prixTotalCommande;
    }

    public void setPrixTotalCommande(double prixTotalCommande) {
        this.prixTotalCommande = prixTotalCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
}
