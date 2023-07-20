package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Passenger_setPhone_fec6a16ac9_Test {

    @Mock
    private Passenger passenger;

    @Before
    public void setUp() {
        when(passenger.getPhone()).thenReturn("1234567890");
    }

    @Test
    public void testSetPhoneSuccess() {
        when(passenger.getPhone()).thenReturn("0987654321");
        passenger.setPhone("0987654321");
        assertEquals("0987654321", passenger.getPhone());
    }

    @Test
    public void testSetPhoneFailure() {
        when(passenger.getPhone()).thenReturn("1234567890");
        passenger.setPhone("invalid");
        assertEquals("1234567890", passenger.getPhone());
    }
}
