package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Reservation_getFlight_b1ee20be6e_Test {

    @Mock
    private Reservation reservation;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFlightSuccess() {
        Flight flight = new Flight();
        flight.setFlightNumber("AA123"); 

        when(reservation.getFlight()).thenReturn(flight);

        Flight result = reservation.getFlight();

        assertEquals(flight, result);
        assertEquals("AA123", result.getFlightNumber());
    }

    @Test
    public void testGetFlightNull() {
        when(reservation.getFlight()).thenReturn(null);

        Flight result = reservation.getFlight();

        assertEquals(null, result);
    }
}
