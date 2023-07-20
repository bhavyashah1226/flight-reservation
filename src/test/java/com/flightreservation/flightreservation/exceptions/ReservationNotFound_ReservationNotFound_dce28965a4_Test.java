package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationNotFound_ReservationNotFound_dce28965a4_Test {

    private ReservationNotFound reservationNotFound;

    @BeforeEach
    public void setUp() {
        reservationNotFound = new ReservationNotFound();
        reservationNotFound.setMessage("Reservation not found");
    }

    @Test
    public void testReservationNotFoundMessage() {
        assertEquals("Reservation not found", reservationNotFound.getMessage());
    }

    @Test
    public void testReservationNotFoundStatus() {
        ResponseStatus responseStatus = reservationNotFound.getClass().getAnnotation(ResponseStatus.class);
        assertEquals(HttpStatus.NOT_FOUND, responseStatus.value());
    }
}
