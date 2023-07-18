package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passenger_toString_2393b88875_Test {

    private Passenger passenger;

    @BeforeEach
    public void setup() {
        passenger = new Passenger();
    }

    @Test
    public void testToStringWithAllFields() {
        passenger.setFirstName("John");
        passenger.setMiddleName("Doe");
        passenger.setLastName("Smith");
        passenger.setEmail("johnsmith@example.com");
        passenger.setPhone("1234567890");
        String expected = "Passenger{firstName='John', middleName='Doe', lastName='Smith', email='johnsmith@example.com', phone='1234567890'}";
        assertEquals(expected, passenger.toString());
    }

    @Test
    public void testToStringWithMissingFields() {
        passenger.setFirstName("John");
        passenger.setMiddleName("");
        passenger.setLastName("Smith");
        passenger.setEmail("johnsmith@example.com");
        passenger.setPhone("");
        String expected = "Passenger{firstName='John', middleName='', lastName='Smith', email='johnsmith@example.com', phone=''}";
        assertEquals(expected, passenger.toString());
    }
}
