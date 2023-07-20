package com.flightreservation.flightreservation.domains;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Flight_toString_2393b88875_Test {

    private Flight flight;

    @BeforeEach
    public void setup() {
        flight = new Flight();
        flight.setFlightNumber("FR123");
        flight.setOperatingAirlines("Airline1");
        flight.setDepartureCity("City1");
        flight.setArrivalCity("City2");
        flight.setDateOfDeparture(new Date());
        flight.setEstimatedDepartureTime(new Timestamp(new Date().getTime()));
    }

    @Test
    public void testToString() {
        String expected = "Flight{" +
                "flightNumber='" + flight.getFlightNumber() + '\'' +
                ", operatingAirlines='" + flight.getOperatingAirlines() + '\'' +
                ", departureCity='" + flight.getDepartureCity() + '\'' +
                ", arrivalCity='" + flight.getArrivalCity() + '\'' +
                ", dateOfDeparture=" + flight.getDateOfDeparture() +
                ", estimatedDepartureTime=" + flight.getEstimatedDepartureTime() +
                '}';
        assertEquals(expected, flight.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        Flight nullFlight = new Flight();
        String expected = "Flight{" +
                "flightNumber='" + null + '\'' +
                ", operatingAirlines='" + null + '\'' +
                ", departureCity='" + null + '\'' +
                ", arrivalCity='" + null + '\'' +
                ", dateOfDeparture=" + null +
                ", estimatedDepartureTime=" + null +
                '}';
        assertEquals(expected, nullFlight.toString());
    }
}
