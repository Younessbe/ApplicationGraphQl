package org.sid.elbalghitiapp.dao.repository;

import org.sid.elbalghitiapp.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByName(String name);

    public List<Student> findByNameAndDateNaissance(String naissance);
}
