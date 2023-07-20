package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_toString_2393b88875_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testToString_AllFieldsPresent() {
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password123");

        String expected = "User{firstName='John', lastName='Doe', email='john.doe@example.com', password='password123'}";
        assertEquals(expected, user.toString());
    }

    @Test
    public void testToString_SomeFieldsMissing() {
        user.setFirstName("John");
        user.setLastName("Doe");

        String expected = "User{firstName='John', lastName='Doe', email='', password=''}";
        assertEquals(expected, user.toString());
    }
}
