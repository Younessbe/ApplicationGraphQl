package org.sid.elbalghitiapp.dto;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.function.RenderingResponse;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class StudentDTO {
    @GeneratedValue()
    private int id_Student;
    private String name;
    private String email;
    private Date dateNaissance;


}
