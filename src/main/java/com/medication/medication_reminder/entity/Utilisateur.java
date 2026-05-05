package com.medication.medication_reminder.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private int age;

    private String telephone;

    //constructeurs
    public Utilisateur() {}

    public Utilisateur(Long id, String nom, int age, String telephone) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.telephone = telephone;
    }

    //getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<Medicament> medicaments;
}
