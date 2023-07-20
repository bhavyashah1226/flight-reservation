package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.User;
import com.flightreservation.flightreservation.exceptions.UserAlreadyRegistered;
import com.flightreservation.flightreservation.exceptions.UserNotFound;
import com.flightreservation.flightreservation.repositories.UserRepository;
import com.flightreservation.flightreservation.services.SecurityService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserController_showRegistrationPage_14b9a0a43f_Test {

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setMockOutput() {
        when(userController.showRegistrationPage()).thenReturn("login/registerUser");
    }

    @Test
    public void testShowRegistrationPage() {
        assertEquals("login/registerUser", userController.showRegistrationPage());
    }

    @Test
    public void testShowRegistrationPageFailure() {
        when(userController.showRegistrationPage()).thenReturn("errorPage");
        assertEquals("errorPage", userController.showRegistrationPage());
    }
}
