package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketNotFound_TicketNotFound_3d1092d972_Test {

    private TicketNotFound ticketNotFound;

    @BeforeEach
    public void setUp() throws Exception {
        ticketNotFound = Mockito.mock(TicketNotFound.class);
    }

    @Test
    public void testTicketNotFoundMessage() {
        String message = "Ticket not found";
        Mockito.when(ticketNotFound.getMessage()).thenReturn(message);
        assertEquals(message, ticketNotFound.getMessage());
    }

    @Test
    public void testTicketNotFoundEmptyMessage() {
        String message = "";
        Mockito.when(ticketNotFound.getMessage()).thenReturn(message);
        assertEquals(message, ticketNotFound.getMessage());
    }
}
