package com.umctec.code.challenge.repository;

import com.umctec.code.challenge.domain.HealthInsurance;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, UUID> {}
