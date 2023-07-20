package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.Flight;
import com.flightreservation.flightreservation.repositories.FlightRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FlightController_addFlight_be0d577f91_Test {

    @InjectMocks
    private FlightController flightController;

    @Mock
    private FlightRepository flightRepository;

    @Mock
    private ModelMap modelMap;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddFlight_SuccessCase() {
        Flight flight = new Flight();
        flight.setFlightNumber("FN1234");

        when(flightRepository.save(flight)).thenReturn(flight);

        String viewName = flightController.addFlight(flight, modelMap);

        verify(flightRepository).save(flight);
        verify(modelMap).addAttribute("msg", "Flight Added Successfully");

        assertEquals("flights/addFlight", viewName);
    }

    @Test
    public void testAddFlight_FailureCase() {
        Flight flight = new Flight();
        flight.setFlightNumber("FN1234");

        when(flightRepository.save(flight)).thenThrow(new RuntimeException("DB Error"));

        try {
            flightController.addFlight(flight, modelMap);
        } catch (RuntimeException e) {
            assertEquals("DB Error", e.getMessage());
        }

        verify(flightRepository).save(flight);
    }
}
