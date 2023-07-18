package com.flightreservation.flightreservation.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

public class UserController_showRegistrationPage_14b9a0a43f_Test {

    @InjectMocks
    UserController userController;

    @Mock
    Logger LOGGER;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShowRegistrationPage_Success() {
        doNothing().when(LOGGER).info("Inside showRegistrationPage()");
        String result = userController.showRegistrationPage();
        verify(LOGGER, times(1)).info("Inside showRegistrationPage()");
        assertEquals("login/registerUser", result);
    }

    @Test
    public void testShowRegistrationPage_Failure() {
        doNothing().when(LOGGER).info("Inside showRegistrationPage()");
        String result = userController.showRegistrationPage();
        verify(LOGGER, times(1)).info("Inside showRegistrationPage()");
        assertNotEquals("login/invalid", result);
    }
}
