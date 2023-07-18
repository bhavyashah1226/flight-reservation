package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AbstractEntity_getId_eb19b6a6d6_Test {

    @InjectMocks
    private AbstractEntity abstractEntity;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 123L;
        abstractEntity.setId(expectedId);
        Long actualId = abstractEntity.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID.");
    }

    @Test
    public void testGetIdFailure() {
        Long expectedId = 123L;
        abstractEntity.setId(456L);
        Long actualId = abstractEntity.getId();
        assertNotEquals(expectedId, actualId, "The expected ID matches the actual ID but it shouldn't.");
    }
}
