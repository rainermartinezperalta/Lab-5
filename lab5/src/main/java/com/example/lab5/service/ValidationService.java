package com.example.lab5.service;

public class ValidationService {

    // Validate email with stricter criteria
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    // Validate password with enhanced rules
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        return hasDigit && hasSpecialChar;
    }
}
