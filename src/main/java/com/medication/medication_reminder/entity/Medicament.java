package com.medication.medication_reminder.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Medicament {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String nom;

    @Setter
    @Getter
    private String dosage;

    @Setter
    @Getter
    private String description;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public Medicament() {
    }

    public Medicament(Long id, String nom, String dosage, String description, Utilisateur utilisateur) {
        this.id = id;
        this.nom = nom;
        this.dosage = dosage;
        this.description = description;
        this.utilisateur = utilisateur;
    }

    @OneToMany(mappedBy = "medicament", cascade = CascadeType.ALL)
    private List<Rappel> rappels;
}