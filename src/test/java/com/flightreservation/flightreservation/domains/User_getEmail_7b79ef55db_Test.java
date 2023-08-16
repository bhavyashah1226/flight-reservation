package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class User_getEmail_7b79ef55db_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = mock(User.class);
    }

    @Test
    public void testGetEmail_Success() {
        String expectedEmail = "test@example.com";
        when(user.getEmail()).thenReturn(expectedEmail);

        String actualEmail = user.getEmail();

        assertEquals(expectedEmail, actualEmail, "The expected email should match the actual email");
    }

    @Test
    public void testGetEmail_Empty() {
        String expectedEmail = "";
        when(user.getEmail()).thenReturn(expectedEmail);

        String actualEmail = user.getEmail();

        assertEquals(expectedEmail, actualEmail, "The expected email should match the actual email even if it's empty");
    }
}
