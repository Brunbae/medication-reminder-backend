package com.medication.medication_reminder.repository;


import com.medication.medication_reminder.entity.Rappel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RappelRepository extends JpaRepository<Rappel, Long> {
}
