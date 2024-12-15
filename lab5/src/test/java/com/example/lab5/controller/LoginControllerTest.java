package com.example.lab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class LoginControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Test
    public void testValidLogin() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

        mockMvc.perform(post("/login")
                .param("username", "testuser")
                .param("password", "validpassword"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("username", "testuser"));
    }
}
