package com.medication.medication_reminder.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;
    private String nom;
    private Integer age;
    private String sexe;
    private String telephone;
    private Double poids;
    private Integer taille;
    private String groupeSanguin;
    private String tensionArterielle;
    private String maladiesChroniques;
    private String allergies;
    private String medecinTraitant;
    private String contactUrgence;
    private String email;
    private String password;
    }