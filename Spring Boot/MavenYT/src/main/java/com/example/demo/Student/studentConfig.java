package com.example.demo.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.*;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            student mariam = new student(
                    "Mariam",
                    "Mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,17)
            );


            student mavlonbek = new student(
                    "Mavlonbek",
                    "Mavlonbek@gmail.com",
                    LocalDate.of(2002, Month.OCTOBER,17)
            );



            repository.saveAll(
                    List.of(mariam,mavlonbek)
            );



        };
    }
}
