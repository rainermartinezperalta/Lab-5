package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @GetMapping("/validateEmail")
    public String showEmailForm() {
        return "validateEmail";
    }

    @PostMapping("/validateEmail")
    public String validateEmail(@RequestParam String email, Model model) {
        if (email.contains("@") && email.contains(".")) {
            model.addAttribute("message", "Valid email");
        } else {
            model.addAttribute("message", "Invalid email");
        }
        return "validateEmail";
    }
}
