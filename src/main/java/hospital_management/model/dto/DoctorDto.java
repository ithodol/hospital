package hospital_management.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    // 의사 (Doctor) 테이블
    private int doctorid;
    private String name;
    private String specialty;
    private String phone;
    private String createdat;
}
