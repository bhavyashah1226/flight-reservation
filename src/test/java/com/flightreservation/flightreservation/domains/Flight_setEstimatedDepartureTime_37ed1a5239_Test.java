package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import java.sql.Timestamp;
import java.util.Date;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class Flight_setEstimatedDepartureTime_37ed1a5239_Test {

    @InjectMocks
    private Flight flight;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetEstimatedDepartureTime() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        flight.setEstimatedDepartureTime(timestamp);
        assertEquals(timestamp, flight.getEstimatedDepartureTime());
    }

    @Test
    public void testSetEstimatedDepartureTime_Null() {
        flight.setEstimatedDepartureTime(null);
        assertEquals(null, flight.getEstimatedDepartureTime());
    }
}
