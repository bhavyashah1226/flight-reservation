package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reservation_getNumberOfBags_4e8beb8ff5_Test {

    @InjectMocks
    private Reservation reservation;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNumberOfBags() {
        reservation.setNumberOfBags(2);
        assertEquals(2, reservation.getNumberOfBags());
    }

    @Test
    public void testGetNumberOfBagsZero() {
        reservation.setNumberOfBags(0);
        assertEquals(0, reservation.getNumberOfBags());
    }
}
