package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class User_setRoles_f43af5993c_Test {

    @Mock
    private User user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetRoles() {
        Set<Role> roles = new HashSet<>();
        roles.add(new Role());
        roles.add(new Role());

        user.setRoles(roles);

        assertEquals(roles, user.getRoles());
    }

    @Test
    public void testSetRolesWithNull() {
        user.setRoles(null);

        assertNull(user.getRoles());
    }
}
