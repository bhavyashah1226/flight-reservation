package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Flight_setDateOfDeparture_63ab78ac82_Test {

    private Flight flight;

    @BeforeEach
    public void setUp() {
        flight = new Flight();
    }

    @Test
    public void testSetDateOfDepartureSuccess() {
        Date dateOfDeparture = new Timestamp(System.currentTimeMillis());
        flight.setDateOfDeparture(dateOfDeparture);
        assertEquals(dateOfDeparture, flight.getDateOfDeparture());
    }

    @Test
    public void testSetDateOfDepartureNull() {
        flight.setDateOfDeparture(null);
        assertEquals(null, flight.getDateOfDeparture());
    }
}
