package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Flight_setDateOfDeparture_63ab78ac82_Test {

    @InjectMocks
    private Flight flight;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetDateOfDeparture_success() {
        Date dateOfDeparture = new Timestamp(System.currentTimeMillis());
        flight.setDateOfDeparture(dateOfDeparture);
        assertEquals(dateOfDeparture, flight.getDateOfDeparture());
    }

    @Test(expected = NullPointerException.class)
    public void testSetDateOfDeparture_null() {
        flight.setDateOfDeparture(null);
    }
}
