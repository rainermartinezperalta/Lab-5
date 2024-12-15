package com.example.lab5;

import com.example.lab5.config.TestSecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestSecurityConfig.class)
class Lab5ApplicationTests {

    @Test
    void contextLoads() {
    }
}
