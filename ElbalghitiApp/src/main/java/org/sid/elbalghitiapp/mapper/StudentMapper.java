package org.sid.elbalghitiapp.mapper;

import org.modelmapper.ModelMapper;
import org.sid.elbalghitiapp.dao.entities.Student;
import org.sid.elbalghitiapp.dto.StudentDTO;

public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDTO studentDTO){
        return mapper.map(studentDTO,Student.class);
    }
    public StudentDTO fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDTO.class);
    }
}
