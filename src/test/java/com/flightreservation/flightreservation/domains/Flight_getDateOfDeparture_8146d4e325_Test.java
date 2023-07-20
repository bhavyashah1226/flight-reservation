package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Flight_getDateOfDeparture_8146d4e325_Test {

    @InjectMocks
    private Flight flight;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDateOfDeparture() {
        Date date = new Date();
        flight.setDateOfDeparture(date);
        assertEquals(date, flight.getDateOfDeparture());
    }

    @Test
    public void testGetDateOfDeparture_Null() {
        flight.setDateOfDeparture(null);
        assertEquals(null, flight.getDateOfDeparture());
    }
}
