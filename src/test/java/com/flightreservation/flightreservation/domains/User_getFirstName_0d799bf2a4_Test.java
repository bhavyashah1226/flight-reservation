package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class User_getFirstName_0d799bf2a4_Test {

    @Mock
    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        when(user.getFirstName()).thenReturn("John");
    }

    @Test
    public void testGetFirstNameSuccess() {
        String expectedFirstName = "John";
        String actualFirstName = user.getFirstName();
        assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void testGetFirstNameFailure() {
        String unexpectedFirstName = "Jane";
        String actualFirstName = user.getFirstName();
        assertNotEquals(unexpectedFirstName, actualFirstName);
    }
}
