package com.example.lab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PasswordController.class)
class PasswordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testValidatePasswordValid() throws Exception {
        mockMvc.perform(post("/validatePassword").param("password", "StrongPassword1!"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString("Valid password")));
    }

    @Test
    void testValidatePasswordInvalid() throws Exception {
        mockMvc.perform(post("/validatePassword").param("password", "weak"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString("Invalid password")));
    }
}
