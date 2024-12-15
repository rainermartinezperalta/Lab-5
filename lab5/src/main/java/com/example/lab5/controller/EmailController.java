package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmailController {

    @GetMapping("/validateEmail")
    public String showEmailForm() {
        return "validateEmail";
    }

    @PostMapping("/validateEmail")
    public String validateEmail(@RequestParam String email, Model model) {
        String message;
        if (email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            message = "Valid email address!";
        } else {
            message = "Invalid email address!";
        }
        model.addAttribute("message", message);
        return "validateEmail";
    }
}
