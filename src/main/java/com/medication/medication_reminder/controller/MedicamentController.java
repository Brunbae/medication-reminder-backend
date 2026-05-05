package com.medication.medication_reminder.controller;



import com.medication.medication_reminder.entity.Medicament;
import com.medication.medication_reminder.service.MedicamentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicaments")
public class MedicamentController {

    private final MedicamentService medicamentService;

    public MedicamentController(MedicamentService medicamentService) {
        this.medicamentService = medicamentService;
    }

    @PostMapping
    public Medicament ajouter(@RequestBody Medicament medicament) {
        return medicamentService.ajouterMedicament(medicament);
    }

    @GetMapping
    public List<Medicament> afficher() {
        return medicamentService.afficherMedicaments();
    }
}
