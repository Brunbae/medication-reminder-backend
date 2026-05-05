package com.medication.medication_reminder.repository;


import com.medication.medication_reminder.entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
}
