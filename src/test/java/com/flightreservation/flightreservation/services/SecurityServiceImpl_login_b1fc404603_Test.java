package com.flightreservation.flightreservation.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class SecurityServiceImpl_login_b1fc404603_Test {

    @InjectMocks
    private SecurityServiceImpl securityService;

    @Mock
    private UserDetailsService userDetailsService;

    @Mock
    private AuthenticationManager authenticationManager;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoginSuccess() {
        UserDetails userDetails = new User("testUser", "testPassword", new ArrayList<>());

        when(userDetailsService.loadUserByUsername("testUser")).thenReturn(userDetails);
        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(null);

        boolean result = securityService.login("testUser", "testPassword");

        assertEquals(true, result);
    }

    @Test
    public void testLoginFailure() {
        UserDetails userDetails = new User("testUser", "wrongPassword", new ArrayList<>());

        when(userDetailsService.loadUserByUsername("testUser")).thenReturn(userDetails);
        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenThrow(new BadCredentialsException("Bad credentials"));

        boolean result = securityService.login("testUser", "testPassword");

        assertEquals(false, result);
    }
}
