package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Commande;
import com.parkauto.rest.entity.LigneCommande;
import com.parkauto.rest.service.CommandeService;
import com.parkauto.rest.service.LigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class LigneCommandeController {
    @Autowired
    LigneCommandeService ligneCommandeService;

    @PostMapping("/ligneCmd")
    public LigneCommande LigneCmd(@Validated @RequestBody(required = false) LigneCommande ligneCmd) {
        return ligneCommandeService.saveLigneCommande(ligneCmd);
    }

    @GetMapping("/ligneCmd")
    public List<LigneCommande> getAllLigneCmds() {
        return ligneCommandeService.getAllLigneCommande();
    }

    @GetMapping("/ligneCmd/{idLigneCmd}")
    public ResponseEntity<?> findLigneCmdById(@PathVariable(name = "idLigneCmd") Long idLigneCommande) {
        if (idLigneCommande == null) {
            return ResponseEntity.badRequest().body("Cannot find ligneCmd with null id");
        }
        LigneCommande ligneCmd = ligneCommandeService.getLigneCommandeById(idLigneCommande);
        if (ligneCmd == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ligneCmd);
    }
}
