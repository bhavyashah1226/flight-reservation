package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Reservation_setFlight_6ddd2cc04a_Test {

    @InjectMocks
    Reservation reservation = new Reservation();

    @Mock
    Flight flight = new Flight();

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSetFlight() {
        reservation.setFlight(flight);
        assertEquals(flight, reservation.getFlight());
    }

    @Test
    public void testSetFlightNull() {
        reservation.setFlight(null);
        assertNull(reservation.getFlight());
    }
}
