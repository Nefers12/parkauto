package com.parkauto.rest.repository;

import com.parkauto.rest.entity.Commande;
import com.parkauto.rest.entity.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long> {
}