package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passenger_getMiddleName_1fb9604eaa_Test {

    @InjectMocks
    private Passenger passenger;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMiddleName_WhenMiddleNameIsPresent() {
        String expectedMiddleName = "John";
        passenger.setMiddleName(expectedMiddleName);
        String actualMiddleName = passenger.getMiddleName();
        assertEquals(expectedMiddleName, actualMiddleName);
    }

    @Test
    public void testGetMiddleName_WhenMiddleNameIsNull() {
        String expectedMiddleName = null;
        passenger.setMiddleName(expectedMiddleName);
        String actualMiddleName = passenger.getMiddleName();
        assertEquals(expectedMiddleName, actualMiddleName);
    }
}
