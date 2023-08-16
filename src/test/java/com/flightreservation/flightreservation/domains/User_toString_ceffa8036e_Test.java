package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_toString_ceffa8036e_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password123");
    }

    @Test
    public void testToString() {
        String expected = "User{firstName='John', lastName='Doe', email='john.doe@example.com', password='password123'}";
        assertEquals(expected, user.toString());
    }

    @Test
    public void testToStringWithEmptyFields() {
        user = new User();
        String expected = "User{firstName='', lastName='', email='', password=''}";
        assertEquals(expected, user.toString());
    }

    // TODO: Add more test cases as necessary
}
