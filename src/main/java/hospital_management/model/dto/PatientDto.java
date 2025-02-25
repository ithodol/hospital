package hospital_management.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
    // 환자 (Patient) 테이블
    private int patientid;
    private String name;
    private String birthdate;
    private String phone;
    private String address;
    private String createdat;
}
