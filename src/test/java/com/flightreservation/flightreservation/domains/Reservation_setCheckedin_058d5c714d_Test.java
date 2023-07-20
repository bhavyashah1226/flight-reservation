package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Reservation_setCheckedin_058d5c714d_Test {

    private Reservation reservation;

    @BeforeEach
    public void setUp() {
        reservation = new Reservation();
    }

    @Test
    public void testSetCheckedInTrue() {
        reservation.setCheckedIn(true);
        assertTrue(reservation.isCheckedIn());
    }

    @Test
    public void testSetCheckedInFalse() {
        reservation.setCheckedIn(false);
        assertFalse(reservation.isCheckedIn());
    }
}
