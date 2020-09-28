package com.umctec.code.challenge.repository;

import com.umctec.code.challenge.domain.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {}

