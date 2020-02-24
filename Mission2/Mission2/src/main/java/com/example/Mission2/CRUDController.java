package com.example.Mission2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CRUDController {

    @Autowired
    private Service service;

    @PostMapping("/add")
    public void create(@RequestBody PatientDetails patientDetails)
    {
        service.addPatientDetails(patientDetails);
    }

    @GetMapping("/view")
    public List<PatientDetails> read()
    {
        return service.getPatientDetailsList();
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody PatientDetails patientDetails)
    {
        service.updatePatientDetails(id,patientDetails);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity delete(@PathVariable int id)
    {
        service.deletePatientDetails(id);
        return ResponseEntity.ok().build();
    }

}
