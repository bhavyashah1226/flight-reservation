package com.flightreservation.flightreservation.security.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.authentication.AuthenticationManager;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WebSecurityConfig_customAuthenticationManager_9921585580_Test {

    @InjectMocks
    private WebSecurityConfig webSecurityConfig;

    @Mock
    private AuthenticationManager authenticationManager;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCustomAuthenticationManager_Success() throws Exception {
        when(webSecurityConfig.customAuthenticationManager()).thenReturn(authenticationManager);
        AuthenticationManager result = webSecurityConfig.customAuthenticationManager();
        assertNotNull(result);
    }

    @Test
    public void testCustomAuthenticationManager_Failure() throws Exception {
        when(webSecurityConfig.customAuthenticationManager()).thenThrow(new Exception());
        assertThrows(Exception.class, () -> webSecurityConfig.customAuthenticationManager());
    }
}
