package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
           Student mariam = new Student(
                   "Mariam",
                   "mariam.jamal@gamil.com",
                   LocalDate.of(2000, Month.JANUARY, 5)

           );

            Student alex = new Student(
                    "Alex",
                    "Alex@gamil.com",
                    LocalDate.of(2004, Month.JANUARY, 5)

            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
