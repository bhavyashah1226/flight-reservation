// Test generated by RoostGPT for test flightReservation using AI Type Open AI and AI Model gpt-4

package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reservation_isCheckedin_8e59a0bdb3_Test {

    @Mock
    private Reservation reservation;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsCheckedInTrue() {
        Mockito.when(reservation.isCheckedin()).thenReturn(true);
        boolean checkedInStatus = reservation.isCheckedin();
        assertEquals(true, checkedInStatus, "The checked in status should be true");
    }

    @Test
    public void testIsCheckedInFalse() {
        Mockito.when(reservation.isCheckedin()).thenReturn(false);
        boolean checkedInStatus = reservation.isCheckedin();
        assertEquals(false, checkedInStatus, "The checked in status should be false");
    }
}
