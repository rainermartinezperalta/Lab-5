package com.example.lab5.controller;

import com.example.lab5.config.TestSecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmailController.class)
@Import(TestSecurityConfig.class)
class EmailControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testValidateEmailValid() throws Exception {
        mockMvc.perform(post("/validateEmail").param("email", "test@example.com"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString("Valid email")));
    }

    @Test
    void testValidateEmailInvalid() throws Exception {
        mockMvc.perform(post("/validateEmail").param("email", "invalid-email"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString("Invalid email")));
    }
}
