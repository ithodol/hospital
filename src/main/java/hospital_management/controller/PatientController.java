package hospital_management.controller;

import hospital_management.model.dto.PatientDto;
import hospital_management.service.PatientService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public boolean save(@RequestBody PatientDto patientDto) {
        return patientService.save(patientDto);
    }

    @GetMapping
    public List<PatientDto> findAll() {
        return patientService.findAll();
    }

    @GetMapping("/view")
    public PatientDto find(@RequestParam int patientid){
        return patientService.find(patientid);
    }

    @PutMapping
    public boolean update(@RequestBody PatientDto patientDto) {
        return patientService.update(patientDto);
    }

    @DeleteMapping
    public boolean delete(@RequestParam int patientid) {
        return patientService.delete(patientid);
    }

}






















