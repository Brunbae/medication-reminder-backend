package com.medication.medication_reminder.entity;


import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@Entity
public class Rappel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime heure;

    private String message;

    @ManyToOne
    @JoinColumn(name = "medicament_id")
    private Medicament medicament;

    public Rappel() {
    }

    public Rappel(Long id, LocalTime heure, String message, Medicament medicament) {
        this.id = id;
        this.heure = heure;
        this.message = message;
        this.medicament = medicament;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

}