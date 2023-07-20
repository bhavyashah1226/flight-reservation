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

public class ReservationController_showCompleteReservation_68889bb606_Test {

    @InjectMocks
    ReservationController reservationController = new ReservationController();

    @Mock
    FlightRepository flightRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testShowCompleteReservation_FlightExists() {
        Flight flight = new Flight();
        flight.setId(1L);
        when(flightRepository.findById(1L)).thenReturn(Optional.of(flight));

        ModelMap modelMap = new ModelMap();
        String viewName = reservationController.showCompleteReservation(1L, modelMap);

        assertEquals("reservation/completeReservation", viewName);
        assertEquals(flight, modelMap.get("flight"));
    }

    @Test
    public void testShowCompleteReservation_FlightDoesNotExist() {
        when(flightRepository.findById(1L)).thenReturn(Optional.empty());

        ModelMap modelMap = new ModelMap();

        assertThrows(FlightNotFound.class, () -> {
            reservationController.showCompleteReservation(1L, modelMap);
        });
    }
}
