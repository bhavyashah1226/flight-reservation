package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Role_getAuthority_856fb4b0e1_Test {

    @Test
    public void testGetAuthoritySuccess() {
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        assertEquals("ROLE_ADMIN", role.getAuthority(), "Authority should be ROLE_ADMIN");
    }

    @Test
    public void testGetAuthorityFailure() {
        Role role = new Role();
        role.setName("ROLE_USER");
        assertEquals("ROLE_ADMIN", role.getAuthority(), "Authority should not be ROLE_ADMIN");
    }
}
