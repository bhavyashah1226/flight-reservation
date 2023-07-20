package com.flightreservation.flightreservation.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TicketNotFound_TicketNotFound_d4b7aa247f_Test {

    @Mock
    private TicketNotFound ticketNotFound;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTicketNotFound() {
        String message = "Ticket not found";
        when(ticketNotFound.getMessage()).thenReturn(message);

        TicketNotFound testTicketNotFound = new TicketNotFound(message);
        assertEquals(message, testTicketNotFound.getMessage());
    }

    @Test
    public void testTicketNotFoundWithDifferentMessage() {
        String message = "Different message";
        when(ticketNotFound.getMessage()).thenReturn(message);

        TicketNotFound testTicketNotFound = new TicketNotFound(message);
        assertEquals(message, testTicketNotFound.getMessage());
    }
}
