package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAlreadyRegistered_UserAlreadyRegistered_bda0571c7b_Test {

    private UserAlreadyRegistered userAlreadyRegistered;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testUserAlreadyRegistered_success() {
        String message = "User already registered";
        userAlreadyRegistered = new UserAlreadyRegistered(message);
        assertEquals(message, userAlreadyRegistered.getMessage());
    }

    @Test
    public void testUserAlreadyRegistered_emptyMessage() {
        String message = "";
        userAlreadyRegistered = new UserAlreadyRegistered(message);
        assertEquals(message, userAlreadyRegistered.getMessage());
    }
}
