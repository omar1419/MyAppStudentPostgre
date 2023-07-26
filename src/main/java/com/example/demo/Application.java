package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return   args -> {
         Student feriel = new Student(
                    "Feriel",
                    "Rabeh",
                    "feriel@gmail.com",
                    5
         );
            studentRepository.save(feriel);
        };
    }
    //
    @Bean
    CommandLineRunner commandLineRunner2(StudentRepository studentRepository){
        return   args -> {
            Student lila = new Student(
                    "lila",
                    "Rabeh",
                    "lila@gmail.com",
                    1
            );
            studentRepository.save(lila);
        };
    }
    //
}
