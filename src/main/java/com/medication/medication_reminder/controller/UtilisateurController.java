package com.medication.medication_reminder.controller;

import com.medication.medication_reminder.entity.Utilisateur;
import com.medication.medication_reminder.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping
    public Utilisateur ajouter(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.ajouterUtilisateur(utilisateur);
    }

    @GetMapping
    public List<Utilisateur> afficher() {
        return utilisateurService.afficherUtilisateurs();
    }
}