package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmailController {

    @GetMapping("/validateEmail")
    public String showEmailForm() {
        return "validateEmail";
    }

    @PostMapping("/validateEmail")
    public String validateEmailHtml(@RequestParam String email, Model model) {
        boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        model.addAttribute("email", email);
        model.addAttribute("isValid", isValid);
        return "validateEmail";
    }

    @PostMapping("/api/validateEmail")
    @ResponseBody
    public Map<String, Boolean> validateEmailJson(@RequestParam String email) {
        boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        return Map.of("isValid", isValid);
    }
}
