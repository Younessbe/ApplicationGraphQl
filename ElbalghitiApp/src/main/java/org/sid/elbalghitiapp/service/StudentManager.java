package org.sid.elbalghitiapp.service;

import org.sid.elbalghitiapp.dao.entities.Student;
import org.sid.elbalghitiapp.dao.repository.StudentRepository;
import org.sid.elbalghitiapp.dto.StudentDTO;
import org.sid.elbalghitiapp.mapper.StudentMapper;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    public StudentDTO saveStudent(StudentDTO studentDTO){
        Student student= studentMapper.fromStudentDtoToStudent(studentDTO);
        student=studentRepository.save(student);
        studentDTO=studentMapper.fromStudentToStudentDto(student);
        return studentDTO;
    }
    public List<StudentDTO> getAvionByNaissance(String naissance) {
        List<Student> students = studentRepository.findByNameAndDateNaissance(naissance);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDTOS;
    }


}
