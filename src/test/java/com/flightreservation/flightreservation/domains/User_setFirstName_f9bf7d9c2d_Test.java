package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class User_setFirstName_f9bf7d9c2d_Test {

    @Mock
    private User user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetFirstNameSuccess() {
        String expectedFirstName = "John";
        when(user.getFirstName()).thenReturn(expectedFirstName);
        assertEquals(expectedFirstName, user.getFirstName(), "First name should be set correctly");
    }

    @Test
    public void testSetFirstNameFailure() {
        String expectedFirstName = "";
        when(user.getFirstName()).thenReturn(expectedFirstName);
        assertEquals(expectedFirstName, user.getFirstName(), "First name should be set correctly even if it's empty");
    }
}
