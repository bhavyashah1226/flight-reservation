package com.flightreservation.flightreservation.controllers;

import com.flightreservation.flightreservation.domains.User;
import com.flightreservation.flightreservation.exceptions.UserAlreadyRegistered;
import com.flightreservation.flightreservation.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserController_register_1c4be2b8c1_Test {

    @Mock
    private UserRepository userRepository;

    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @InjectMocks
    private UserController userController;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setEmail("test@test.com");
        user.setPassword("password");
    }

    @Test
    public void register_UserNotExists_ReturnsLoginPage() {
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.empty());
        when(bCryptPasswordEncoder.encode(user.getPassword())).thenReturn("encodedPassword");

        String result = userController.register(user);

        assertEquals("login/login", result);
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void register_UserExists_ThrowsUserAlreadyRegisteredException() {
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.of(user));

        try {
            userController.register(user);
            fail("Expected UserAlreadyRegistered exception not thrown");
        } catch (UserAlreadyRegistered ex) {
            // Expected exception
        }
        verify(userRepository, times(0)).save(user);
    }
}
