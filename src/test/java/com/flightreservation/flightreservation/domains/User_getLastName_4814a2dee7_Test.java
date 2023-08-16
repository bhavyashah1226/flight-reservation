package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class User_getLastName_4814a2dee7_Test {
    
    private User user;

    @BeforeEach
    public void setUp() {
        user = Mockito.mock(User.class);
    }

    @Test
    public void testGetLastName_Success() {
        Mockito.when(user.getLastName()).thenReturn("Smith");
        String actual = user.getLastName();
        Assertions.assertEquals("Smith", actual);
    }

    @Test
    public void testGetLastName_Null() {
        Mockito.when(user.getLastName()).thenReturn(null);
        String actual = user.getLastName();
        Assertions.assertNull(actual);
    }
}
