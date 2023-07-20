package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Reservation_getPassenger_dd171db682_Test {

    @Mock
    private Passenger passenger;

    @InjectMocks
    private Reservation reservation;

    @BeforeEach
    public void setup() {
        // TODO: Replace with actual passenger details
        when(passenger.getName()).thenReturn("Test Passenger");
        when(passenger.getEmail()).thenReturn("test@passenger.com");
    }

    @Test
    public void testGetPassengerSuccess() {
        Passenger result = reservation.getPassenger();
        assertEquals("Test Passenger", result.getName());
        assertEquals("test@passenger.com", result.getEmail());
    }

    @Test
    public void testGetPassengerFailure() {
        when(passenger.getName()).thenReturn(null);
        when(passenger.getEmail()).thenReturn(null);
        
        Passenger result = reservation.getPassenger();
        assertEquals(null, result.getName());
        assertEquals(null, result.getEmail());
    }
}
