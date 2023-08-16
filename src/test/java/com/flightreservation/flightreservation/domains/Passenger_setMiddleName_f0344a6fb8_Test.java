// Test generated by RoostGPT for test flightReservation using AI Type Open AI and AI Model gpt-4

package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Passenger_setMiddleName_f0344a6fb8_Test {

    private Passenger passenger;

    @BeforeEach
    public void setup() {
        passenger = new Passenger();
    }

    @Test
    public void testSetMiddleName_whenMiddleNameIsNotNull() {
        String middleName = "John";
        passenger.setMiddleName(middleName);
        assertEquals(middleName, passenger.getMiddleName());
    }

    @Test
    public void testSetMiddleName_whenMiddleNameIsNull() {
        String middleName = null;
        passenger.setMiddleName(middleName);
        assertEquals(middleName, passenger.getMiddleName());
    }
}
