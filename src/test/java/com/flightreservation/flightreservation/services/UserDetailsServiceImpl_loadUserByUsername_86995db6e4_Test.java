package com.flightreservation.flightreservation.services;

import com.flightreservation.flightreservation.domains.User;
import com.flightreservation.flightreservation.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserDetailsServiceImpl_loadUserByUsername_86995db6e4_Test {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoadUserByUsername_Success() {
        User mockUser = new User();
        mockUser.setEmail("test@test.com");
        mockUser.setPassword("password");
        when(userRepository.findByEmail("test@test.com")).thenReturn(Optional.of(mockUser));

        UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername("test@test.com");

        assertEquals("test@test.com", userDetails.getUsername());
        assertEquals("password", userDetails.getPassword());
    }

    @Test
    public void testLoadUserByUsername_UserNotFound() {
        when(userRepository.findByEmail("test@test.com")).thenReturn(Optional.empty());

        Exception exception = assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsServiceImpl.loadUserByUsername("test@test.com");
        });

        String expectedMessage = "User not found for email test@test.com";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
