package hospital_management.service;

import hospital_management.model.dto.AppointmentDto;
import hospital_management.model.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentMapper appointmentMapper;

    public boolean save(AppointmentDto appointmentDto){
        return appointmentMapper.save(appointmentDto);
    }

    public List<AppointmentDto> findDate(String appointmentdate){
        return appointmentMapper.findDate(appointmentdate);
    }

    public List<AppointmentDto> findP(int patientid){
        return appointmentMapper.findP(patientid);
    }

    public List<AppointmentDto> findD(int doctorid){
        return appointmentMapper.findD(doctorid);
    }

    public boolean update(AppointmentDto appointmentDto){
        return appointmentMapper.update(appointmentDto);
    }

    public boolean delete(int appointmentid){
        return appointmentMapper.delete(appointmentid);
    }

}
