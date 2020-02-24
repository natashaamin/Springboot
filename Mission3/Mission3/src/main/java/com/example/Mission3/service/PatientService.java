package com.example.Mission3.service;

import com.example.Mission3.model.PatientDetails;
import com.example.Mission3.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service

public class PatientService {
    //call repo
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public PatientDetails save(PatientDetails patientDetails) {
         return patientRepository.save(patientDetails);
    }

    public List<PatientDetails> findAllDetails() {
        return patientRepository.findAll();
    }

    public Optional<PatientDetails> findById(Long id) {
        return patientRepository.findById(id);
    }

    public void deleteId(Long id) {
        patientRepository.deleteById(id);
    }

    private void PatientDetails (PatientDetails existingDetails, PatientDetails newDetails){
        existingDetails.setName(newDetails.getName());
        existingDetails.setNumber(newDetails.getNumber());
        patientRepository.save(existingDetails);
    }







}
