package com.example.lab5.controller;

import com.example.lab5.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String showQuestion(Model model) {
        List<Question> questions = Arrays.asList(
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
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String checkAnswers(@RequestParam("answers") String[] answers, Model model) {
        List<Question> questions = Arrays.asList(
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

        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (i < answers.length && questions.get(i).getAnswer().equalsIgnoreCase(answers[i].trim())) {
                score++;
                questions.get(i).setUserAnswer(answers[i].trim());
                questions.get(i).setCorrect(true);
            } else {
                questions.get(i).setUserAnswer(i < answers.length ? answers[i].trim() : "");
                questions.get(i).setCorrect(false);
            }
        }

        model.addAttribute("score", score);
        model.addAttribute("total", questions.size());
        model.addAttribute("questions", questions);
        return "quizResult";
    }
}
