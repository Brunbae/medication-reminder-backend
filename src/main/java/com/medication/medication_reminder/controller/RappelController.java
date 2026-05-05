package com.medication.medication_reminder.controller;
import com.medication.medication_reminder.entity.Rappel;
import com.medication.medication_reminder.service.RappelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rappels")
public class RappelController {

    private final RappelService rappelService;

    public RappelController(RappelService rappelService) {
        this.rappelService = rappelService;
    }

    @PostMapping
    public Rappel ajouter(@RequestBody Rappel rappel) {
        return rappelService.ajouterRappel(rappel);
    }

    @GetMapping
    public List<Rappel> afficher() {
        return rappelService.afficherRappels();
    }
}
