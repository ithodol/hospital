package hospital_management.service;

import hospital_management.model.dto.DoctorDto;
import hospital_management.model.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    public boolean save(DoctorDto doctorDto){
        return doctorMapper.save(doctorDto);
    }

    public List<DoctorDto> findAll(){
        return doctorMapper.findAll();
    }

    public DoctorDto find(int doctorid){
        return doctorMapper.find(doctorid);
    }

    public boolean update(DoctorDto doctorDto){
        return doctorMapper.update(doctorDto);
    }

    public boolean delete(int doctorid){
        return doctorMapper.delete(doctorid);
    }
}
