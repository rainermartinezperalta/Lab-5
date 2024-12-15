package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Return the login form view
    }

    @PostMapping("/login")
    public String processLogin(String username, String password, Model model) {
        if ("testuser".equals(username) && "testpassword".equals(password)) {
            return "redirect:/home"; // Redirect on success
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Reload login with error message
        }
    }
}