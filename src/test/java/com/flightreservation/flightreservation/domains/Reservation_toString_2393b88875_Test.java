package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class Reservation_toString_2393b88875_Test {

    private Reservation reservation;
    private Passenger passenger;
    private Flight flight;

    @BeforeEach
    public void setUp() {
        reservation = new Reservation();
        passenger = mock(Passenger.class);
        flight = mock(Flight.class);
    }

    @Test
    public void testToStringWithCheckedInAndBags() {
        reservation.setCheckedIn(true);
        reservation.setNumberOfBags(2);
        reservation.setPassenger(passenger);
        reservation.setFlight(flight);

        String expected = "Reservation{checkedin=true, numberOfBags=2, passenger=" + passenger + ", flight=" + flight + "}";
        assertEquals(expected, reservation.toString());
    }

    @Test
    public void testToStringWithoutCheckedInAndBags() {
        reservation.setCheckedIn(false);
        reservation.setNumberOfBags(0);
        reservation.setPassenger(passenger);
        reservation.setFlight(flight);

        String expected = "Reservation{checkedin=false, numberOfBags=0, passenger=" + passenger + ", flight=" + flight + "}";
        assertEquals(expected, reservation.toString());
    }
}
