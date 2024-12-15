package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Assumes you have a `login.html` template in `src/main/resources/templates/`.
    }
}
