package com.parkauto.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VEHICULE")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDVEHICULE")
    private Long matricule;

    @Column(name = "ANNEEMODEL")
    private int anneeModel;

    @Column(name = "PRIX")
    private double prix;

}
