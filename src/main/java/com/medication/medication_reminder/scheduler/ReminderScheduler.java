package com.medication.medication_reminder.scheduler;


import com.medication.medication_reminder.entity.Medication;
import com.medication.medication_reminder.repository.MedicationRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
@Getter
@Setter
public class ReminderScheduler {

    private final MedicationRepository medicationRepository;

    public ReminderScheduler(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    @Scheduled(fixedRate = 60000)
    public void checkMedicationReminders(){

        LocalTime now = LocalTime.now().withSecond(0).withNano(0);

        List<Medication> medications = medicationRepository.findByTime(now);

        medications.forEach(med ->
                System.out.println("Reminder: Take your medication " + med.getName())
        );
        System.out.println("Scheduler running at: " + now);
        }
    }