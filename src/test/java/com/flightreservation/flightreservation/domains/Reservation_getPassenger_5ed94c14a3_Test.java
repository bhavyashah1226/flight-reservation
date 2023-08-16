package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Reservation_getPassenger_5ed94c14a3_Test {

    @Test
    public void testGetPassengerSuccess() {
        // Arrange
        Reservation reservation = new Reservation();
        Passenger mockPassenger = mock(Passenger.class);
        reservation.setPassenger(mockPassenger);

        // Act
        Passenger result = reservation.getPassenger();

        // Assert
        assertEquals(mockPassenger, result);
    }

    @Test
    public void testGetPassengerNull() {
        // Arrange
        Reservation reservation = new Reservation();

        // Act
        Passenger result = reservation.getPassenger();

        // Assert
        assertEquals(null, result);
    }
}
