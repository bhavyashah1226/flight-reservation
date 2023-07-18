package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.Reservation;
import com.flightreservation.flightreservation.exceptions.ReservationNotFound;
import com.flightreservation.flightreservation.repositories.ReservationRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReservationRestController_findReservation_5d1841c2ee_Test {

    @InjectMocks
    ReservationRestController reservationRestController = new ReservationRestController();

    @Mock
    ReservationRepository reservationRepository = new ReservationRepository();

    private static final Long RESERVATION_ID = 1L;

    @Before
    public void setUp() {
        Reservation reservation = new Reservation();
        reservation.setId(RESERVATION_ID);
        when(reservationRepository.findById(RESERVATION_ID)).thenReturn(Optional.of(reservation));
    }

    @Test
    public void testFindReservation_Success() {
        Reservation reservation = reservationRestController.findReservation(RESERVATION_ID);
        assertEquals(RESERVATION_ID, reservation.getId());
    }

    @Test(expected = ReservationNotFound.class)
    public void testFindReservation_ReservationNotFound() {
        when(reservationRepository.findById(RESERVATION_ID)).thenReturn(Optional.empty());
        reservationRestController.findReservation(RESERVATION_ID);
    }
}
