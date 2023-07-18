package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.sql.Timestamp;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Flight_getEstimatedDepartureTime_2bcaac11d4_Test {

    @InjectMocks
    private Flight flight;

    @Mock
    private Timestamp estimatedDepartureTime;

    @Before
    public void setUp() {
        flight = new Flight();
    }

    @Test
    public void testGetEstimatedDepartureTime_success() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        when(estimatedDepartureTime.getTime()).thenReturn(timestamp.getTime());
        flight.setEstimatedDepartureTime(estimatedDepartureTime);
        assertEquals(timestamp, flight.getEstimatedDepartureTime());
    }

    @Test
    public void testGetEstimatedDepartureTime_null() {
        flight.setEstimatedDepartureTime(null);
        assertEquals(null, flight.getEstimatedDepartureTime());
    }
}
