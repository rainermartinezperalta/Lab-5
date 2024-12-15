package com.example.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if (password.length() < 8) {
            return "redirect:/badPassword"; // Redirect to an error page for invalid password
        }
        model.addAttribute("username", username);
        return "welcome"; // Proceed to welcome page
    }
}
