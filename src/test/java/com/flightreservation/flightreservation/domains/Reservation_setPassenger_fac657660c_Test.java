package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Reservation_setPassenger_fac657660c_Test {

    @InjectMocks
    private Reservation reservation;

    @Mock
    private Passenger passenger;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetPassengerValidCase() {
        reservation.setPassenger(passenger);
        assertEquals(passenger, reservation.getPassenger());
    }

    @Test
    public void testSetPassengerNullCase() {
        reservation.setPassenger(null);
        assertEquals(null, reservation.getPassenger());
    }
}
