package com.example.Mission3.repository;

import com.example.Mission3.model.PatientDetails;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//repository is connection between application and DB
public interface PatientRepository extends JpaRepository<PatientDetails, Long> {
}
