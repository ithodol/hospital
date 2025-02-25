package hospital_management.model.mapper;


import hospital_management.model.dto.DoctorDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DoctorMapper {
    @Insert("insert into doctor (name, specialty, phone) values(#{name}, #{specialty}, #{phone})")
    public boolean save(DoctorDto doctorDto);

    @Select("select * from doctor")
    public List<DoctorDto> findAll();

    @Select("select * from doctor where doctorid = #{doctorid}")
    public DoctorDto find(int doctorid);

    @Update("update doctor set name = #{name}, specialty = #{specialty}, phone = #{phone} where doctorid = #{doctorid}")
    public boolean update(DoctorDto doctorDto);

    @Delete("delete from doctor where doctorid = #{doctorid}")
    public boolean delete(int doctorid);
}
