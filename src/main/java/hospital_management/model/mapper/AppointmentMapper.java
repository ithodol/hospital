package hospital_management.model.mapper;

import hospital_management.model.dto.AppointmentDto;
import hospital_management.model.dto.DoctorDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    @Insert("insert into appointment (patientid, doctorid, appointmentdate, appointmenttime) values(#{patientid}, #{doctorid}, #{appointmentdate}, #{appointmenttime})")
    public boolean save(AppointmentDto appointmentDto);

    @Select("select * from appointment where appointmentdate = #{appointmentdate}")
    public List<AppointmentDto> findDate(String appointmentdate);

    @Select("select * from appointment where patientid = #{patientid}")
    public List<AppointmentDto> findP(int patientid);

    @Select("select * from appointment where doctorid = #{doctorid}")
    public List<AppointmentDto> findD(int doctorid);

    @Update("update appointment set appointmentdate = #{appointmentdate}, appointmenttime = #{appointmenttime}, status = #{status} where appointmentid = #{appointmentid}")
    public boolean update(AppointmentDto appointmentDto);

    @Delete("delete from appointment where appointmentid = #{appointmentid}")
    public boolean delete(int appointmentid);
}
