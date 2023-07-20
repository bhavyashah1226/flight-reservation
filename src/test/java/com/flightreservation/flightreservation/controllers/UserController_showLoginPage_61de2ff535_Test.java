package com.flightreservation.flightreservation.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserController_showLoginPage_61de2ff535_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testShowLoginPage_success() {
        LOGGER.info("Inside showLoginPage()");

        String result = userController.showLoginPage();

        assertEquals("login/login", result);
    }

    @Test
    public void testShowLoginPage_infoLoggingDisabled() {
        String result = userController.showLoginPage();

        assertEquals("login/login", result);
    }
}
