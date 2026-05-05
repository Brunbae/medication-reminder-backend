package com.medication.medication_reminder.service;


import com.medication.medication_reminder.entity.Rappel;
import com.medication.medication_reminder.repository.RappelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RappelService {

    private final RappelRepository rappelRepository;

    public RappelService(RappelRepository rappelRepository) {
        this.rappelRepository = rappelRepository;
    }

    public Rappel ajouterRappel(Rappel rappel) {
        return rappelRepository.save(rappel);
    }

    public List<Rappel> afficherRappels() {
        return rappelRepository.findAll();
    }
}
