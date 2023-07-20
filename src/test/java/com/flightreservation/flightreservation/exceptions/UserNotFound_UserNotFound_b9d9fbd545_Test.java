package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserNotFound_UserNotFound_b9d9fbd545_Test {

    private UserNotFound userNotFound;

    @BeforeEach
    public void setUp() {
        userNotFound = new UserNotFound();
    }

    @Test
    public void testUserNotFoundMessage() {
        // Assuming UserNotFound has a method to set message
        userNotFound.setMessage("User not found");
        assertEquals("User not found", userNotFound.getMessage());
    }

    @Test
    public void testUserNotFoundEmptyMessage() {
        UserNotFound userNotFoundEmptyMessage = new UserNotFound();
        // Assuming UserNotFound has a method to set message
        userNotFoundEmptyMessage.setMessage("");
        assertEquals("", userNotFoundEmptyMessage.getMessage());
    }
}
