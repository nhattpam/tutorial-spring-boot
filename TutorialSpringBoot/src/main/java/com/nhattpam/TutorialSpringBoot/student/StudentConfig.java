package com.nhattpam.TutorialSpringBoot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student HHJoo = new Student(
                    "Han Hyo Joo",
                    "hhy@gmail.com",
                    LocalDate.of(1987, Month.FEBRUARY, 22)
            );
            Student NhatP = new Student(
                    "Nhat Pham",
                    "nhat2up@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 8)
            );
             Student Ruby = new Student(
                    "Nhat Ruby",
                    "Ruby@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 8)
            );
            
            //save vo db
            repository.saveAll(
                    List.of(HHJoo, NhatP, Ruby)
            );
        };
    }
}
