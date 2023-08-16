package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_getFirstName_94e06d272a_Test {

    @Mock
    private User user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(user.getFirstName()).thenReturn("John");
    }

    @Test
    public void testGetFirstNameSuccess() {
        String expectedFirstName = "John";
        String actualFirstName = user.getFirstName();
        assertEquals(expectedFirstName, actualFirstName, "The expected first name does not match the actual first name");
    }

    @Test
    public void testGetFirstNameFailure() {
        String expectedFirstName = "Michael";
        String actualFirstName = user.getFirstName();
        assertEquals(expectedFirstName, actualFirstName, "The expected first name does not match the actual first name");
    }
}
