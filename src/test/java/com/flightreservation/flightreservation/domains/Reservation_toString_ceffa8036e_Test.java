package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reservation_toString_ceffa8036e_Test {

    private Reservation reservation;

    @Mock
    private Passenger passenger;

    @Mock
    private Flight flight;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        reservation = new Reservation();
        reservation.setCheckedIn(true);
        reservation.setNumberOfBags(2);
        reservation.setPassenger(passenger);
        reservation.setFlight(flight);
    }

    @Test
    public void testToString_withCheckedInAndTwoBags() {
        String expected = "Reservation{checkedin=true, numberOfBags=2, passenger=" + passenger + ", flight=" + flight + "}";
        assertEquals(expected, reservation.toString());
    }

    @Test
    public void testToString_withNotCheckedInAndNoBags() {
        reservation.setCheckedIn(false);
        reservation.setNumberOfBags(0);
        String expected = "Reservation{checkedin=false, numberOfBags=0, passenger=" + passenger + ", flight=" + flight + "}";
        assertEquals(expected, reservation.toString());
    }
}
