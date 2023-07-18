package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Flight_getDateOfDeparture_8146d4e325_Test {

    @InjectMocks
    private Flight flight;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDateOfDeparture() {
        Date testDate = new Timestamp(System.currentTimeMillis());
        flight.setDateOfDeparture(testDate);
        assertEquals(testDate, flight.getDateOfDeparture(), "The returned date should match the set date");
    }

    @Test
    public void testGetDateOfDepartureWhenNoDateSet() {
        assertNull(flight.getDateOfDeparture(), "The returned date should be null if no date was set");
    }
}
