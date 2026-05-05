package com.medication.medication_reminder.dto;

import java.time.LocalTime;

public class MedicationDTO {

    private Long id;
    private String name;
    private String dose;
    private LocalTime time;

    public MedicationDTO() {}

    public MedicationDTO(Long id, String name, String dose, LocalTime time) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}