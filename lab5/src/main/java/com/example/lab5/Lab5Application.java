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
            new Question("What is 90 + 0.0003?", "90.0003"),
            new Question("What is 10^10 * 2?", "20,000,000,000"),
            new Question("What is the capital of Dominican Republic Called?", "Santo Domingo"),
            new Question("Where are you headed?", "I'm heading home."),
            new Question("Where do you live?", "With my parents."),
            new Question("Where do your parents live?", "They live with me."),
            new Question("Ok, where do you all live?", "We all live together."),
            new Question("Ok, so where is your house?", "It's next to my neighbor's house."),
            new Question("And where does your neighbor live?", "Oou, you wouldn't believe me if I told you."),
            new Question("Try me.", "Next to my house.")
        );
    }
}
