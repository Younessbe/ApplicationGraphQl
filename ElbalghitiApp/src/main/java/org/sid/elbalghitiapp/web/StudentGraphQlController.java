package org.sid.elbalghitiapp.web;

import org.sid.elbalghitiapp.dto.StudentDTO;
import org.sid.elbalghitiapp.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.Date;
import java.util.List;

public class StudentGraphQlController {
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveAvion(@Argument StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }
    @QueryMapping
    public List<StudentDTO> getAvionByDateNaissance(@Argument Date naissance){
        return studentService.getStudentByNaissance(naissance);
    }

}
