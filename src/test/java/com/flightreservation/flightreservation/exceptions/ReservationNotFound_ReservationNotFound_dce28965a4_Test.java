// Test generated by RoostGPT for test flightReservation using AI Type Open AI and AI Model gpt-4

package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ReservationNotFound_ReservationNotFound_dce28965a4_Test {

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReservationNotFound() {
        String message = "Reservation not found";
        ReservationNotFound exception = new ReservationNotFound(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testReservationNotFoundEmptyMessage() {
        String message = "";
        ReservationNotFound exception = new ReservationNotFound(message);
        assertEquals(message, exception.getMessage());
    }

}
