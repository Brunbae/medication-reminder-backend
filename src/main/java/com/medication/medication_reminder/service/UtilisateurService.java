package com.medication.medication_reminder.service;


import com.medication.medication_reminder.entity.Utilisateur;
import com.medication.medication_reminder.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> afficherUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}
