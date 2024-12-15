package com.example.lab5.controller;

import com.example.lab5.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes("username")
public class QuizController {

    @GetMapping("/quiz")
    public String showQuiz(@SessionAttribute(name = "username", required = false) String username, Model model) {
        if (username == null) {
            return "redirect:/login";
        }

        List<Question> questions = Arrays.asList(
            new Question("What is 90 + 0.0003?", "90.0003"),
            new Question("What is 10^10 * 2?", "20,000,000,000"),
            new Question("What is the capital of Dominican Republic?", "Santo Domingo")
        );
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String processQuiz(@RequestParam String[] answers, Model model) {
        List<Question> questions = Arrays.asList(
            new Question("What is 90 + 0.0003?", "90.0003"),
            new Question("What is 10^10 * 2?", "20,000,000,000"),
            new Question("What is the capital of Dominican Republic?", "Santo Domingo")
        );

        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (i < answers.length && questions.get(i).getAnswer().equalsIgnoreCase(answers[i].trim())) {
                score++;
                questions.get(i).setCorrect(true);
            }
        }

        model.addAttribute("score", score);
        model.addAttribute("total", questions.size());
        model.addAttribute("questions", questions);
        return "quizResult";
    }
}
