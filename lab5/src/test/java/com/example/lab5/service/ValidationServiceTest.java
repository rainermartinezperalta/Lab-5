package com.example.lab5.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationServiceTest {

    private final ValidationService validationService = new ValidationService();

    @Test
    void testValidatePasswordValid() {
        assertTrue(validationService.isValidPassword("Strong1!"));
    }

    @Test
    void testValidatePasswordInvalid() {
        assertFalse(validationService.isValidPassword("weak"));
    }

    @Test
    void testValidateEmailValid() {
        assertTrue(validationService.isValidEmail("test@example.com"));
    }

    @Test
    void testValidateEmailInvalid() {
        assertFalse(validationService.isValidEmail("invalid-email"));
    }
}
