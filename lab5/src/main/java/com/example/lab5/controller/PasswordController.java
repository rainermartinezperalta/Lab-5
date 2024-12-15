package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordController {

    @GetMapping("/validatePassword")
    public String showPasswordForm() {
        return "validatePassword";
    }

    @PostMapping("/validatePassword")
    public String validatePassword(@RequestParam String password, Model model) {
        String message;
        if (password.length() >= 8 &&
            password.matches(".*\\d.*") &&
            password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            message = "Valid password";
        } else {
            message = "Invalid password: must be at least 8 characters long, contain a digit, and a special character.";
        }
        model.addAttribute("message", message);
        return "validatePassword";
    }
}
