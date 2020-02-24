package com.example.Mission3.controller;

import com.example.Mission3.model.PatientDetails;
import com.example.Mission3.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
//log error function
@Slf4j

public class CRUDController {
    //call service
    @Autowired
    private PatientService patientService;

    public CRUDController(PatientService patientService){
        this.patientService = patientService;

    }

    @PostMapping("/add")
    public PatientDetails create(@RequestBody PatientDetails patientDetails) {
        System.out.println("hi");
        return patientService.save(patientDetails);
    }

    @GetMapping("/view")
    public List<PatientDetails> findAll() {
        return patientService.findAllDetails();
    }

    @GetMapping("/view/{id}")
    public PatientDetails getDetailById(@PathVariable(value="id") Long id)
    {
        return patientService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("id" + id));
    }


    @PutMapping("/update/{id}")
    public PatientDetails update(@PathVariable(value = "id") Long id, @Valid @RequestBody PatientDetails patientDetails)
    {
        PatientDetails p = patientService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id" + id));

        p.setName(patientDetails.getName());
        p.setNumber(patientDetails.getNumber());

        PatientDetails updatedDetails = patientService.save(p);
        return updatedDetails;
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<PatientDetails> remove(@PathVariable(value = "id") Long id)
    {
        PatientDetails p = patientService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id" + id));

        patientService.deleteId(id);
        return ResponseEntity.ok().build();
    }

}
