package org.sid.elbalghitiapp;

import org.sid.elbalghitiapp.dto.StudentDTO;
import org.sid.elbalghitiapp.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ElbalghitiAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElbalghitiAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(StudentService studentService){
        return  args -> {
            studentService.saveStudent(
                    (StudentDTO) List.of(
                            StudentDTO.builder().id_Student(1).name("ahmoundi").email("ahoundi@gmail.com").build(),
                            StudentDTO.builder().id_Student(2).name("Nahed").email("nahed@gmail.com").build(),
                            StudentDTO.builder().id_Student(3).name("Youness").email("youness@gmail.com").build(),
                            StudentDTO.builder().id_Student(4).name("yassmine").email("yassmine@gmail.com").build()
                    )

            );
        };
    }

}
