package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Flight_setFlightNumber_6cc5fe6430_Test {

    private Flight flight;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        flight = new Flight();
    }

    @Test
    public void testSetFlightNumber() {
        String flightNumber = "FR1234";
        flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, flight.getFlightNumber());
    }

    @Test
    public void testSetFlightNumber_Null() {
        String flightNumber = null;
        flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, flight.getFlightNumber());
    }

    // TODO: Add more test cases as per your requirement.
}
