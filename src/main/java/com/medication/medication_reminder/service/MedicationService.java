package com.medication.medication_reminder.service;

import com.medication.medication_reminder.dto.MedicationDTO;
import com.medication.medication_reminder.entity.Medication;
import com.medication.medication_reminder.entity.User;
import com.medication.medication_reminder.exception.ResourceNotFoundException;
import com.medication.medication_reminder.repository.MedicationRepository;
import com.medication.medication_reminder.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {

    private final MedicationRepository medicationRepository;
    private final UserRepository userRepository;

    public MedicationService(MedicationRepository medicationRepository,
                             UserRepository userRepository) {
        this.medicationRepository = medicationRepository;
        this.userRepository = userRepository;
    }

    public Medication addMedicationToUser(Long userId, Medication medication){

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        medication.setUser(user);

        return medicationRepository.save(medication);
    }

    public List<Medication> getMedicationsByUser(Long userId){
        return medicationRepository.findByUserId(userId);
    }

    public void deleteMedication(Long id){
        medicationRepository.deleteById(id);
    }
    public Medication updateMedication(Long id, Medication medicationDetails){

        Medication medication = medicationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        medication.setName(medicationDetails.getName());

        return medicationRepository.save(medication);
    }

    public MedicationDTO convertToDTO(Medication medication){

        MedicationDTO dto = new MedicationDTO();

        dto.setId(medication.getId());
        dto.setName(medication.getName());
        dto.setTime(medication.getTime());

        return dto;
    }
}