package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.User;
import com.flightreservation.flightreservation.exceptions.UserAlreadyRegistered;
import com.flightreservation.flightreservation.exceptions.UserNotFound;
import com.flightreservation.flightreservation.repositories.UserRepository;
import com.flightreservation.flightreservation.services.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserController_showLoginPage_61de2ff535_Test {

    @InjectMocks
    private UserController userController;

    @Mock
    private Logger LOGGER;

    @Test
    public void testShowLoginPage() {
        String expected = "login/login";
        String actual = userController.showLoginPage();
        assertEquals(expected, actual);
        verify(LOGGER).info("Inside showLoginPage()");
    }

    @Test
    public void testShowLoginPageFailure() {
        String expected = "login/error";
        String actual = userController.showLoginPage();
        assertEquals(expected, actual);
        verify(LOGGER).info("Inside showLoginPage()");
    }
}
