package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class Passenger_getEmail_7bf7b35375_Test {

    @InjectMocks
    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger();
        passenger.setEmail("test@example.com");
    }

    @Test
    public void testGetEmailSuccess() {
        String expectedEmail = "test@example.com";
        String actualEmail = passenger.getEmail();
        assertEquals(expectedEmail, actualEmail);
    }

    @Test
    public void testGetEmailFailure() {
        String incorrectEmail = "wrong@example.com";
        String actualEmail = passenger.getEmail();
        assertNotEquals(incorrectEmail, actualEmail);
    }
}
