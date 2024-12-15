package com.example.lab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QuizController.class)
public class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSubmitQuizAnswersCorrect() throws Exception {
        mockMvc.perform(post("/quiz")
                .param("answers", "90.0003"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("<strong>1</strong> / <strong>10</strong>")));
    }

    @Test
    void testSubmitQuizAnswersIncorrect() throws Exception {
        mockMvc.perform(post("/quiz")
                .param("answers", "wrong-answer"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("<strong>0</strong> / <strong>10</strong>")));
    }
}
