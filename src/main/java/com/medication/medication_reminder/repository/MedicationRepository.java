package com.medication.medication_reminder.repository;


import com.medication.medication_reminder.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface MedicationRepository extends JpaRepository<Medication, Long> {

    List<Medication> findByTime(LocalTime time);
    List<Medication> findByUserId(Long userId);


}
