package com.medication.medication_reminder.controller;

import com.medication.medication_reminder.entity.Medication;
import com.medication.medication_reminder.service.MedicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService){
        this.medicationService = medicationService;
    }

    @PostMapping("/user/{userId}")
    public Medication addMedicationToUser(@PathVariable Long userId,
                                          @RequestBody Medication medication){

        return medicationService.addMedicationToUser(userId, medication);
    }

    @GetMapping("/user/{userId}")
    public List<Medication> getMedicationsByUser(@PathVariable Long userId){

        return medicationService.getMedicationsByUser(userId);
    }
    @PutMapping("/{id}")
    public Medication updateMedication(@PathVariable Long id,
                                       @RequestBody Medication medication){

        return medicationService.updateMedication(id, medication);
    }

    @DeleteMapping("/{id}")
    public void deleteMedication(@PathVariable Long id){
        medicationService.deleteMedication(id);
    }
}