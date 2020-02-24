package com.example.Mission2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service

public class Service {

    private List<PatientDetails> patientDetailsList = new ArrayList<>();

    public List<PatientDetails> getPatientDetailsList()
    {
        return patientDetailsList;
    }

    public void addPatientDetails(PatientDetails patientDetails)
    {
        patientDetailsList.add(patientDetails);
    }

    public void updatePatientDetails(@PathVariable Integer id, @Valid @RequestBody PatientDetails patientDetails)
    {
        //patientDetailsList =patientDetailsList.stream().filter(a -> a.id == id).map(p -> p=patientDetails).collect(Collectors.toList());
        patientDetailsList.add(patientDetails);
    }

    public void deletePatientDetails(@PathVariable Integer id)
    {
        patientDetailsList.removeIf(a -> a.id == id);
    }


    }


