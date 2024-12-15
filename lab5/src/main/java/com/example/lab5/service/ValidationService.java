package com.example.lab5.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public boolean isValidPassword(String password) {
        return password != null && password.length() >= 8 &&
               password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
