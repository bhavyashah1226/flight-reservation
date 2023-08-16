package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationNotFoundTest {

    private ReservationNotFound reservationNotFound;

    @BeforeEach
    public void setUp() {
        reservationNotFound = new ReservationNotFound();
    }

    // Test case 1: Check if the exception message is correctly set
    @Test
    public void testExceptionMessage() {
        reservationNotFound.setMessage("Reservation not found");
        assertEquals("Reservation not found", reservationNotFound.getMessage());
    }

    // Test case 2: Check if the exception message is not set to an arbitrary string
    @Test
    public void testExceptionMessageNotArbitrary() {
        reservationNotFound.setMessage("Reservation not found");
        assertNotEquals("Arbitrary string", reservationNotFound.getMessage());
    }

}
