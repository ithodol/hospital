package hospital_management.service;

import hospital_management.model.dto.PatientDto;
import hospital_management.model.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientMapper patientMapper;

    public boolean save(PatientDto patientDto){
        return patientMapper.save(patientDto);
    }

    public List<PatientDto> findAll(){
        return patientMapper.findAll();
    }

    public PatientDto find(int patientid){
        return patientMapper.find(patientid);
    }

    public boolean update(PatientDto patientDto){
        return patientMapper.update(patientDto);
    }

    public boolean delete(int patientid){
        return patientMapper.delete(patientid);
    }
}
