package com.example.lab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PasswordController.class)
public class PasswordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser // Simulate an authenticated user
    public void testValidatePasswordValid() throws Exception {
        mockMvc.perform(post("/api/validatePassword").param("password", "Test@123"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isValid").value(true));
    }

    @Test
    @WithMockUser // Simulate an authenticated user
    public void testValidatePasswordInvalid() throws Exception {
        mockMvc.perform(post("/api/validatePassword").param("password", "short"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isValid").value(false));
    }
}
