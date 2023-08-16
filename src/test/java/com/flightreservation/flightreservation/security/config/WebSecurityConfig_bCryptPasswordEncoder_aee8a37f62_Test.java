package com.flightreservation.flightreservation.security.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class WebSecurityConfig_bCryptPasswordEncoder_aee8a37f62_Test {
    private WebSecurityConfig webSecurityConfig;

    @BeforeEach
    void setUp() {
        webSecurityConfig = new WebSecurityConfig();
    }

    @Test
    void testBCryptPasswordEncoderNotNull() {
        BCryptPasswordEncoder bCryptPasswordEncoder = webSecurityConfig.bCryptPasswordEncoder();
        assertNotNull(bCryptPasswordEncoder, "BCryptPasswordEncoder should not be null");
    }

    @Test
    void testBCryptPasswordEncoderEncode() {
        BCryptPasswordEncoder bCryptPasswordEncoder = webSecurityConfig.bCryptPasswordEncoder();
        String rawPassword = "test_password";
        String encodedPassword = bCryptPasswordEncoder.encode(rawPassword);

        assertTrue(bCryptPasswordEncoder.matches(rawPassword, encodedPassword),
                "Encoded password should match raw password");
    }
}
