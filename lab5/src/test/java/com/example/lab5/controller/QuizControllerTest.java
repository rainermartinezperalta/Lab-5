package com.example.lab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(QuizController.class)
public class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser // Simulate an authenticated user
    public void testSubmitQuizAnswersCorrect() throws Exception {
        mockMvc.perform(post("/api/quiz").param("answers", "90.0003"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.score").value(1))
                .andExpect(jsonPath("$.total").value(1));
    }

    @Test
    @WithMockUser // Simulate an authenticated user
    public void testSubmitQuizAnswersIncorrect() throws Exception {
        mockMvc.perform(post("/api/quiz").param("answers", "WrongAnswer"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.score").value(0))
                .andExpect(jsonPath("$.total").value(1));
    }
}
