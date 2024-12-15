package com.example.lab5.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidationServiceTest {

    private final ValidationService validationService = new ValidationService();

    @Test
    void testValidateEmail() {
        assertTrue(validationService.isValidEmail("test@example.com"));
        assertFalse(validationService.isValidEmail("invalid-email"));
    }

    @Test
    void testValidatePassword() {
        assertTrue(validationService.isValidPassword("Strong1!"));
        assertFalse(validationService.isValidPassword("weak"));
    }
}
