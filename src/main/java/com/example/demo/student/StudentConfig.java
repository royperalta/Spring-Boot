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
    CommandLineRunner commandLineRunner(StudentRepository repository
    ){
        return args -> {
            Student roy =new Student(
                    1l,
                    "Roy",
                    "rrpb33@gmail.com",
                    LocalDate.of(1991, Month.FEBRUARY,4)

            );
           Student alicia =  new Student(
                    2l,
                    "Alicia",
                    "rAlicia3@gmail.com",
                    LocalDate.of(1990, Month.APRIL,24)

            );
            Student pedro = new Student(
                    3l,
                    "Pedro",
                    "Pedro@gmail.com",
                    LocalDate.of(1986, Month.MARCH,10)

            );

            Student lisbeth=new Student(
                    5l,
                    "Lisbeth",
                    "Lisbet@gmail.com",
                    LocalDate.of(2000, Month.MARCH,10)

            );

            repository.saveAll(
                    List.of(roy,alicia,pedro,lisbeth)
            );
        };

    }

}
