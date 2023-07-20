package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passenger_setMiddleName_64fb9e3fba_Test {

    @Mock
    private Passenger passenger;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        passenger = new Passenger();
    }

    @Test
    public void testSetMiddleNameValid() {
        String middleName = "Robert";
        passenger.setMiddleName(middleName);
        assertEquals(middleName, passenger.getMiddleName(), "Middle name should be set correctly");
    }

    @Test
    public void testSetMiddleNameNull() {
        passenger.setMiddleName(null);
        assertEquals(null, passenger.getMiddleName(), "Middle name should be null");
    }
}
