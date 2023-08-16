package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class FlightNotFound_FlightNotFound_88c554e395_Test {

    private FlightNotFound flightNotFound;

    @BeforeEach
    public void setUp() {
        flightNotFound = new FlightNotFound();
    }

    @Test
    public void testFlightNotFoundExceptionMessage() {
        flightNotFound.setMessage("Flight not found");
        assertEquals("Flight not found", flightNotFound.getMessage());
    }

    @Test
    public void testFlightNotFoundExceptionNullMessage() {
        FlightNotFound nullMessageException = new FlightNotFound();
        nullMessageException.setMessage(null);
        assertNull(nullMessageException.getMessage());
    }
}
