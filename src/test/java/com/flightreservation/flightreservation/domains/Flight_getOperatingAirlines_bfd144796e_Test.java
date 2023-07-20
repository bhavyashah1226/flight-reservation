package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Flight_getOperatingAirlines_bfd144796e_Test {

    @InjectMocks
    private Flight flight;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetOperatingAirlines_Scenario1() {
        String expectedAirline = "Airline1";
        flight.setOperatingAirlines(expectedAirline);

        String actualAirline = flight.getOperatingAirlines();
        assertEquals(expectedAirline, actualAirline, "The expected and actual airlines should match.");
    }

    @Test
    public void testGetOperatingAirlines_Scenario2() {
        String expectedAirline = "Airline2";
        flight.setOperatingAirlines(expectedAirline);

        String actualAirline = flight.getOperatingAirlines();
        assertEquals(expectedAirline, actualAirline, "The expected and actual airlines should match.");
    }

    @Test
    public void testGetOperatingAirlines_NullScenario() {
        flight.setOperatingAirlines(null);

        String actualAirline = flight.getOperatingAirlines();
        assertEquals(null, actualAirline, "The expected and actual airlines should match.");
    }
}
