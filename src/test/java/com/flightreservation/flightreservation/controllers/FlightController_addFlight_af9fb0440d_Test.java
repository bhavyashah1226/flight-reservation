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

public class FlightController_addFlight_af9fb0440d_Test {

    @InjectMocks
    FlightController flightController;

    @Mock
    FlightRepository flightRepository;

    @Mock
    ModelMap modelMap;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddFlight() {
        Flight flight = new Flight();
        when(flightRepository.save(flight)).thenReturn(flight);

        String result = flightController.addFlight(flight, modelMap);

        verify(flightRepository).save(flight);
        verify(modelMap).addAttribute("msg", "Flight Added Successfully");
        assertEquals("flights/addFlight", result);
    }

    @Test
    public void testAddFlightNull() {
        String result = flightController.addFlight(null, modelMap);
        verify(modelMap).addAttribute("msg", "Flight Added Successfully");
        assertEquals("flights/addFlight", result);
    }
}
