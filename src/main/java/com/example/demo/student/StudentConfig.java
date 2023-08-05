package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student peter = new Student(1L, "peter", "peter.lai@gmail.com", LocalDate.of(2023, Month.AUGUST, 5));
            Student coyi = new Student(2L, "coyi", "coyi.chan@gmail.com", LocalDate.of(2000, Month.AUGUST, 5));
            repository.saveAll(List.of(peter, coyi));
        };
    }
}
