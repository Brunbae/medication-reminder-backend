package com.medication.medication_reminder.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class MedicationSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "medication_id")
    private Medication medication;

}
