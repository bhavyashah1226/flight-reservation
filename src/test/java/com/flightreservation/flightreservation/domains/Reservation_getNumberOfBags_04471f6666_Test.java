package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reservation_getNumberOfBags_04471f6666_Test {

    private Reservation reservation;

    @BeforeEach
    public void setup() {
        reservation = new Reservation();
    }

    @Test
    public void testGetNumberOfBags_WhenNoBags() {
        reservation.setNumberOfBags(0);
        int actual = reservation.getNumberOfBags();
        assertEquals(0, actual, "The number of bags should be 0 when no bags are set");
    }

    @Test
    public void testGetNumberOfBags_WhenBagsAreSet() {
        reservation.setNumberOfBags(2);
        int actual = reservation.getNumberOfBags();
        assertEquals(2, actual, "The number of bags should match the set value");
    }
}
