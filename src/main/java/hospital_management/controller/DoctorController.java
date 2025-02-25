package hospital_management.controller;

import hospital_management.model.dto.DoctorDto;
import hospital_management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public boolean save(@RequestBody DoctorDto doctorDto) {
        return doctorService.save(doctorDto);
    }

    @GetMapping
    public List<DoctorDto> findAll() {
        return doctorService.findAll();
    }

    @GetMapping("/view")
    public DoctorDto find(@RequestParam int doctorid){
        return doctorService.find(doctorid);
    }

    @PutMapping
    public boolean update(@RequestBody DoctorDto doctorDto) {
        return doctorService.update(doctorDto);
    }

    @DeleteMapping
    public boolean delete(@RequestParam int doctorid) {
        return doctorService.delete(doctorid);
    }
}
