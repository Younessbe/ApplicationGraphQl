package org.sid.elbalghitiapp.service;

import org.sid.elbalghitiapp.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);
    public List<StudentDTO> getStudentByNaissance(Date naissance);
}
