// Test generated by RoostGPT for test flightReservation using AI Type Open AI and AI Model gpt-4

package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_getLastName_de1cc748dc_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testGetLastName_WhenLastNameIsSet() {
        String expectedLastName = "Smith";
        user.setLastName(expectedLastName);
        String actualLastName = user.getLastName();
        assertEquals(expectedLastName, actualLastName, "The last name should be Smith");
    }

    @Test
    public void testGetLastName_WhenLastNameIsNotSet() {
        String expectedLastName = null;
        String actualLastName = user.getLastName();
        assertEquals(expectedLastName, actualLastName, "The last name should be null as it is not set");
    }
}
