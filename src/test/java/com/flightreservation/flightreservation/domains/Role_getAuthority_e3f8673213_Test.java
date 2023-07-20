package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Role_getAuthority_e3f8673213_Test {

    @MockBean
    private Role role;

    @BeforeEach
    public void setup() {
        role = new Role();
    }

    @Test
    public void testGetAuthority_whenRoleNameIsNotNull() {
        String expectedRoleName = "USER";
        role.setName(expectedRoleName);
        String actualRoleName = role.getAuthority();
        assertEquals(expectedRoleName, actualRoleName, "Role name should be USER");
    }

    @Test
    public void testGetAuthority_whenRoleNameIsNull() {
        role.setName(null);
        String actualRoleName = role.getAuthority();
        assertEquals(null, actualRoleName, "Role name should be null");
    }
}
