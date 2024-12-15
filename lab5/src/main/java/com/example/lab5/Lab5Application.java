package com.example.lab5;

import com.example.lab5.model.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Lab5Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab5Application.class, args);
    }

    @Bean
    public List<Question> questions() {
        return Arrays.asList(
            new Question("What is 2 + 2?", "4"),
            new Question("What is the capital of France?", "Paris")
        );
    }
}
