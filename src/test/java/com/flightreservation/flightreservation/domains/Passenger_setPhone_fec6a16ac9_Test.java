package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import javax.persistence.Entity;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passenger_setPhone_fec6a16ac9_Test {

    private Passenger passenger;

    @BeforeEach
    public void setUp() {
        passenger = Mockito.mock(Passenger.class);
    }

    @Test
    public void testSetPhone_ValidPhone() {
        final String validPhone = "1234567890";
        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                Object arg0 = invocation.getArgument(0);
                assertEquals(validPhone, arg0);
                return null;
            }
        }).when(passenger).setPhone(Mockito.anyString());

        passenger.setPhone(validPhone);
    }

    @Test
    public void testSetPhone_EmptyPhone() {
        final String emptyPhone = "";
        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                Object arg0 = invocation.getArgument(0);
                assertEquals(emptyPhone, arg0);
                return null;
            }
        }).when(passenger).setPhone(Mockito.anyString());

        passenger.setPhone(emptyPhone);
    }
}
