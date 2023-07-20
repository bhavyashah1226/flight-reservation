package com.flightreservation.flightreservation.domains;

import java.sql.Timestamp;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;

public class Flight_getEstimatedDepartureTime_2bcaac11d4_Test {

    @Mock
    private Flight flight;

    @InjectMocks
    private FlightService flightService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetEstimatedDepartureTime_Success() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        when(flight.getEstimatedDepartureTime()).thenReturn(timestamp);

        Timestamp result = flightService.getEstimatedDepartureTime();

        Assertions.assertEquals(timestamp, result, "Expected and actual departure times should match");
    }

    @Test
    public void testGetEstimatedDepartureTime_Null() {
        when(flight.getEstimatedDepartureTime()).thenReturn(null);

        Timestamp result = flightService.getEstimatedDepartureTime();

        Assertions.assertNull(result, "Expected departure time should be null");
    }
}
