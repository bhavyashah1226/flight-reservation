package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class User_getPassword_ec5cf08305_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testGetPasswordSuccess() {
        String expectedPassword = "password123";
        user.setPassword(expectedPassword);
        String actualPassword = user.getPassword();
        assertEquals(expectedPassword, actualPassword, "Password should be same as set");
    }

    @Test
    public void testGetPasswordFailure() {
        String expectedPassword = "password123";
        user.setPassword("wrongPassword");
        String actualPassword = user.getPassword();
        assertNotEquals(expectedPassword, actualPassword, "Password should not be same as set");
    }
}
