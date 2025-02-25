package hospital_management.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {
    // 진료 예약 (Appointment) 테이블
    private int appointmentid;
    private int patientid;
    private int doctorid;
    private String appointmentdate;
    private String appointmenttime;
    private int status;
    private String createdat;


}
