package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_setFirstName_8acaec2cfc_Test {

    @Mock
    User user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        user = new User();
    }

    @Test
    public void testSetFirstNameSuccess() {
        String expectedFirstName = "John";
        user.setFirstName(expectedFirstName);
        assertEquals(expectedFirstName, user.getFirstName(), "First name should be John");
    }

    @Test
    public void testSetFirstNameFailure() {
        String invalidFirstName = "";
        user.setFirstName(invalidFirstName);
        assertEquals("", user.getFirstName(), "First name should be empty");
    }
}
