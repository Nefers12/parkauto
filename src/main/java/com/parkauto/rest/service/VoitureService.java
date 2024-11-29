package com.parkauto.rest.service;

import com.parkauto.rest.entity.Vehicule;
import com.parkauto.rest.entity.Voiture;
import com.parkauto.rest.repository.IVoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {
    @Autowired
    IVoitureRepository voitureRepository;

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    public Voiture getVoitureById(Long idVoiture) {
        return voitureRepository.findById(idVoiture).orElseThrow(() -> new RuntimeException("Voiture not found"));
    }

    public void  deleteVoiture(Voiture voiture) {
        voitureRepository.delete(voiture);
    }
}
