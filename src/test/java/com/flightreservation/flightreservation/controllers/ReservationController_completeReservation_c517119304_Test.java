package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.Flight;
import com.flightreservation.flightreservation.domains.Reservation;
import com.flightreservation.flightreservation.dto.ReservationRequest;
import com.flightreservation.flightreservation.exceptions.FlightNotFound;
import com.flightreservation.flightreservation.repositories.FlightRepository;
import com.flightreservation.flightreservation.services.ReservationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ReservationController_completeReservation_c517119304_Test {

    @InjectMocks
    ReservationController reservationController;

    @Mock
    ReservationService reservationService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCompleteReservation_Success() {
        ReservationRequest reservationRequest = new ReservationRequest();
        reservationRequest.setFlightId(1L);
        Reservation reservation = new Reservation();
        reservation.setId(1L);
        when(reservationService.bookFlight(reservationRequest)).thenReturn(reservation);
        ModelMap modelMap = new ModelMap();
        String result = reservationController.completeReservation(reservationRequest, modelMap);
        assertEquals("reservation/reservationConfirmation", result);
        assertEquals("Reservation created successfully and the reservation id is 1", modelMap.get("msg"));
    }

    @Test
    public void testCompleteReservation_Failure() {
        ReservationRequest reservationRequest = new ReservationRequest();
        reservationRequest.setFlightId(1L);
        when(reservationService.bookFlight(reservationRequest)).thenThrow(new FlightNotFound("Flight not found"));
        ModelMap modelMap = new ModelMap();
        String result = reservationController.completeReservation(reservationRequest, modelMap);
        assertEquals("error", result);
        assertEquals("Flight not found", modelMap.get("error"));
    }
}
