package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class PasswordController {

    @GetMapping("/validatePassword")
    public String showPasswordForm() {
        return "validatePassword";
    }

    @PostMapping("/validatePassword")
    public String validatePasswordHtml(@RequestParam String password, Model model) {
        boolean isValid = password.length() >= 8 &&
                          password.matches(".*\\d.*") &&
                          password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        model.addAttribute("password", password);
        model.addAttribute("isValid", isValid);
        return "validatePassword";
    }

    @PostMapping("/api/validatePassword")
    @ResponseBody
    public Map<String, Boolean> validatePasswordJson(@RequestParam String password) {
        boolean isValid = password.length() >= 8 &&
                          password.matches(".*\\d.*") &&
                          password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        return Map.of("isValid", isValid);
    }
}
