package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.Flight;
import com.flightreservation.flightreservation.exceptions.FlightNotFound;
import com.flightreservation.flightreservation.repositories.FlightRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ReservationController_showCompleteReservation_8f8a4badfa_Test {

    @InjectMocks
    ReservationController reservationController;

    @Mock
    FlightRepository flightRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShowCompleteReservation_FlightExists() {
        Long flightId = 1L;
        Flight flight = new Flight();
        flight.setId(flightId);
        when(flightRepository.findById(flightId)).thenReturn(Optional.of(flight));

        ModelMap modelMap = new ModelMap();
        String viewName = reservationController.showCompleteReservation(flightId, modelMap);

        assertEquals("reservation/completeReservation", viewName);
        assertEquals(flight, modelMap.get("flight"));
    }

    @Test
    public void testShowCompleteReservation_FlightDoesNotExist() {
        Long flightId = 1L;
        when(flightRepository.findById(flightId)).thenReturn(Optional.empty());

        ModelMap modelMap = new ModelMap();
        assertThrows(FlightNotFound.class, () -> reservationController.showCompleteReservation(flightId, modelMap));
    }
}
