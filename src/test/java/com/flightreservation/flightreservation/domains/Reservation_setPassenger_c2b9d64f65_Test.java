package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Reservation_setPassenger_c2b9d64f65_Test {

    @Mock
    private Passenger passenger;

    @InjectMocks
    private Reservation reservation;

    @Test
    public void testSetPassenger() {
        // TODO: Change the value of passengerName to match the expected result
        String passengerName = "John Doe";

        when(passenger.getName()).thenReturn(passengerName);

        reservation.setPassenger(passenger);

        assertEquals(passengerName, reservation.getPassenger().getName());
    }

    @Test
    public void testSetPassengerWithNull() {
        reservation.setPassenger(null);

        assertNull(reservation.getPassenger());
    }
}
