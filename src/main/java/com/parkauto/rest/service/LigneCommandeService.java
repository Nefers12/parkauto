package com.parkauto.rest.service;

import com.parkauto.rest.entity.Commande;
import com.parkauto.rest.entity.LigneCommande;
import com.parkauto.rest.repository.ICommandeRepository;
import com.parkauto.rest.repository.ILigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeService {

    @Autowired
    private ILigneCommandeRepository ligneCommandeRepository;

    public List<LigneCommande> getAllLigneCommande() {
        return ligneCommandeRepository.findAll();
    }

    public LigneCommande saveLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }

    public LigneCommande getLigneCommandeById(Long idLigneCommande) {
        return ligneCommandeRepository.findById(idLigneCommande).orElseThrow(() -> new RuntimeException("Commande not found"));
    }

    public void deleteLigneCommande(LigneCommande ligneCommande) {
        ligneCommandeRepository.delete(ligneCommande);
    }
}