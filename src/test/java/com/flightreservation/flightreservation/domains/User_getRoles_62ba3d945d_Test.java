package com.flightreservation.flightreservation.domains;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class User_getRoles_62ba3d945d_Test {

    @InjectMocks
    User user;

    @Mock
    Set<Role> roles;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        roles = new HashSet<>();
        roles.add(new Role());
        roles.add(new Role());
        user.setRoles(roles);
    }

    @Test
    public void testGetRolesSuccess() {
        when(user.getRoles()).thenReturn(roles);
        Set<Role> actualRoles = user.getRoles();
        assertEquals(roles, actualRoles);
    }

    @Test
    public void testGetRolesFailure() {
        Set<Role> wrongRoles = new HashSet<>();
        wrongRoles.add(new Role());
        when(user.getRoles()).thenReturn(roles);
        Set<Role> actualRoles = user.getRoles();
        // TODO: Change the expected roles to test failure scenario
        assertEquals(wrongRoles, actualRoles);
    }
}
