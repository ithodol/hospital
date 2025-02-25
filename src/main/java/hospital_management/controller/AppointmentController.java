package hospital_management.controller;


import hospital_management.model.dto.AppointmentDto;
import hospital_management.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public boolean save(@RequestBody AppointmentDto appointmentDto) {
        return appointmentService.save(appointmentDto);
    }

    @GetMapping
    public List<AppointmentDto> findDate(@RequestParam String appointmentdate) {
        return appointmentService.findDate(appointmentdate);
    }

    @GetMapping("/pview")
    public List<AppointmentDto> findP(@RequestParam int patientid) {
        return appointmentService.findP(patientid);
    }

    @GetMapping("/dview")
    public List<AppointmentDto> findD(@RequestParam int doctorid) {
        return appointmentService.findD(doctorid);
    }

    @PutMapping
    public boolean update(@RequestBody AppointmentDto appointmentDto) {
        return appointmentService.update(appointmentDto);
    }

    @DeleteMapping
    public boolean delete(@RequestParam int appointmentid) {
        return appointmentService.delete(appointmentid);
    }

}
