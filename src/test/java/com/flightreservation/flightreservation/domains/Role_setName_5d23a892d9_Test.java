package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Role_setName_5d23a892d9_Test {

    @Mock
    private Role role;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetName_Success() {
        String expectedName = "Admin";
        role.setName(expectedName);
        assertEquals(expectedName, role.getName());
    }

    @Test
    public void testSetName_EmptyString() {
        String expectedName = "";
        role.setName(expectedName);
        assertEquals(expectedName, role.getName());
    }
}
