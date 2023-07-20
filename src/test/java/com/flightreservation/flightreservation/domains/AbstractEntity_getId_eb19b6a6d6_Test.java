package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AbstractEntity_getId_eb19b6a6d6_Test {

    @MockBean
    private AbstractEntity abstractEntity;

    @BeforeEach
    public void setUp() {
        when(abstractEntity.getId()).thenReturn(1L);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        Long actualId = abstractEntity.getId();
        assertEquals(expectedId, actualId, "Expected ID does not match with Actual ID");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 2L;
        Long actualId = abstractEntity.getId();
        assertNotEquals(unexpectedId, actualId, "Unexpected ID matches with Actual ID");
    }
}
