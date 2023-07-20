package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class User_setEmail_8c969b78a8_Test {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void testSetEmail_Null() {
        String email = null;
        user.setEmail(email);
        assertEquals(null, user.getEmail());
    }

    @Test
    void testSetEmail_Empty() {
        String email = "";
        user.setEmail(email);
        assertEquals("", user.getEmail());
    }

    @Test
    void testSetEmail_Valid() {
        String email = "test@example.com";
        user.setEmail(email);
        assertEquals("test@example.com", user.getEmail());
    }
}
