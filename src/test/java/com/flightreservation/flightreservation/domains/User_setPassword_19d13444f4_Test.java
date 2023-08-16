package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_setPassword_19d13444f4_Test {

    private User user;

    @BeforeEach
    public void setup() {
        user = new User();
    }

    @Test
    public void testSetPassword_Success() {
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }

    @Test
    public void testSetPassword_Null() {
        String password = null;
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }
}
