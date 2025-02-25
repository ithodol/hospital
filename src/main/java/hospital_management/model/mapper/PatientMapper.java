package hospital_management.model.mapper;

import hospital_management.model.dto.PatientDto;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface PatientMapper {
    @Insert("insert into patient (name, birthdate, phone,address) values(#{name}, #{birthdate}, #{phone}, #{address})")
    public boolean save(PatientDto patientDto);

    @Select("select * from patient")
    public List<PatientDto> findAll();

    @Select("select * from patient where patientid = #{patientid}")
    public PatientDto find(int patientid);

    @Update("update patient set name = #{name}, birthdate = #{birthdate}, phone = #{phone}, address = #{address} where patientid = #{patientid}")
    public boolean update(PatientDto patientDto);

    @Delete("delete from patient where patientid = #{patientid}")
    public boolean delete(int patientid);
}
