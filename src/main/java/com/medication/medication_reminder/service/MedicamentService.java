package com.medication.medication_reminder.service;





import com.medication.medication_reminder.entity.Medicament;
import com.medication.medication_reminder.repository.MedicamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentService {

    private final MedicamentRepository medicamentRepository;

    public MedicamentService(MedicamentRepository medicamentRepository) {
        this.medicamentRepository = medicamentRepository;
    }

    public Medicament ajouterMedicament(Medicament medicament) {
        return medicamentRepository.save(medicament);
    }

    public List<Medicament> afficherMedicaments() {
        return medicamentRepository.findAll();
    }
}
