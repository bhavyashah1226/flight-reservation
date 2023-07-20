package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_setPassword_94ccb89d82_Test {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testSetPassword() {
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword(), "The password should match the one that was set");
    }

    @Test
    public void testSetEmptyPassword() {
        String password = "";
        user.setPassword(password);
        assertEquals(password, user.getPassword(), "The password should match the one that was set, even if it's empty");
    }
}
