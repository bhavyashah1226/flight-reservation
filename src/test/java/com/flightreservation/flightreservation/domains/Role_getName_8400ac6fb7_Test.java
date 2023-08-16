package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Role_getName_8400ac6fb7_Test {

    private Role role;

    @BeforeEach
    public void setUp() {
        role = new Role();
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "ADMIN";
        role.setName(expectedName);
        String actualName = role.getName();
        assertEquals(expectedName, actualName, "The expected name should match the actual name");
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "USER";
        role.setName("ADMIN");
        String actualName = role.getName();
        assertNotEquals(unexpectedName, actualName, "The unexpected name should not match the actual name");
    }
}
