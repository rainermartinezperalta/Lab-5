package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/registerUser")
    public String register(@RequestParam String email, @RequestParam String password, Model model) {
        String username = email.split("@")[0];
        model.addAttribute("username", username);
        // Here, store the email and password in a database or memory for future login
        model.addAttribute("message", "Registration successful! Your username is: " + username);
        return "login";
    }
}
