package com.flightreservation.flightreservation.domains;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@Entity
public class Flight_toString_2393b88875_Test {

    private Flight flight;

    @BeforeEach
    public void setup() {
        flight = Mockito.mock(Flight.class);
    }

    @Test
    public void testToString() {
        String flightNumber = "AA1234";
        String operatingAirlines = "American Airlines";
        String departureCity = "New York";
        String arrivalCity = "Los Angeles";
        Date dateOfDeparture = new Date();
        Timestamp estimatedDepartureTime = new Timestamp(System.currentTimeMillis());

        Mockito.when(flight.toString()).thenReturn("Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", operatingAirlines='" + operatingAirlines + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", estimatedDepartureTime=" + estimatedDepartureTime +
                '}');

        String expected = "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", operatingAirlines='" + operatingAirlines + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", estimatedDepartureTime=" + estimatedDepartureTime +
                '}';
        Assertions.assertEquals(expected, flight.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        Mockito.when(flight.toString()).thenReturn("Flight{" +
                "flightNumber='" + null + '\'' +
                ", operatingAirlines='" + null + '\'' +
                ", departureCity='" + null + '\'' +
                ", arrivalCity='" + null + '\'' +
                ", dateOfDeparture=" + null +
                ", estimatedDepartureTime=" + null +
                '}');

        String expected = "Flight{" +
                "flightNumber='null'" +
                ", operatingAirlines='null'" +
                ", departureCity='null'" +
                ", arrivalCity='null'" +
                ", dateOfDeparture=null" +
                ", estimatedDepartureTime=null" +
                '}';
        Assertions.assertEquals(expected, flight.toString());
    }
}
