package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reservation_setFlight_c17b20b503_Test {

    @Mock
    private Flight flight;

    private Reservation reservation;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        reservation = new Reservation();
    }

    @Test
    public void testSetFlight() {
        reservation.setFlight(flight);
        assertEquals(flight, reservation.getFlight());
    }

    @Test
    public void testSetFlightWithNull() {
        reservation.setFlight(null);
        assertEquals(null, reservation.getFlight());
    }
}
