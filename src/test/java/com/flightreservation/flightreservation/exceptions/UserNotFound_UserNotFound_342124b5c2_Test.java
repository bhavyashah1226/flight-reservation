package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserNotFound_UserNotFound_342124b5c2_Test {

    private UserNotFound userNotFound;

    @BeforeEach
    public void setUp() {
        userNotFound = new UserNotFound();
    }

    @Test
    public void testUserNotFoundMessage() {
        assertEquals("User not found", userNotFound.getMessage());
    }

    @Test
    public void testUserNotFoundMessageMismatch() {
        // TODO: Change the message to match the one you expect in your application
        assertNotEquals("User not exists", userNotFound.getMessage());
    }
}
