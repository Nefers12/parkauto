package com.parkauto.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LIGNECOMMANDE")
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDLIGNECOMMANDE")
    private Long idLigneCommande;

    @Column(name = "QTELIGNECOMMANDE")
    private int qteLigneCommande;

    @Column(name = "LIBELLELIGNECOMMANDE")
    private String libelleLigneCommande;

    @Column(name = "PRIXLIGNECOMMANDE")
    private double prixLigneCommande;

    @ManyToOne
    @JoinColumn(name = "commande")
    private Commande commande;

    public LigneCommande() {
    }

    public LigneCommande(Commande commande, double prixLigneCommande, String libelleLigneCommande, int qteLigneCommande, Long idLigneCommande) {
        this.commande = commande;
        this.prixLigneCommande = prixLigneCommande;
        this.libelleLigneCommande = libelleLigneCommande;
        this.qteLigneCommande = qteLigneCommande;
        this.idLigneCommande = idLigneCommande;
    }

    public Long getIdLigneCommande() {
        return idLigneCommande;
    }

    public void setIdLigneCommande(Long idLigneCommande) {
        this.idLigneCommande = idLigneCommande;
    }

    public int getQteLigneCommande() {
        return qteLigneCommande;
    }

    public void setQteLigneCommande(int qteLigneCommande) {
        this.qteLigneCommande = qteLigneCommande;
    }

    public String getLibelleLigneCommande() {
        return libelleLigneCommande;
    }

    public void setLibelleLigneCommande(String libelleLigneCommande) {
        this.libelleLigneCommande = libelleLigneCommande;
    }

    public double getPrixLigneCommande() {
        return prixLigneCommande;
    }

    public void setPrixLigneCommande(double prixLigneCommande) {
        this.prixLigneCommande = prixLigneCommande;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
