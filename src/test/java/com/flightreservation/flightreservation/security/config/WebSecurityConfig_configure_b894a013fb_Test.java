package com.flightreservation.flightreservation.security.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class WebSecurityConfig_configure_b894a013fb_Test {

    @Mock
    private HttpSecurity httpSecurity;

    @Test
    public void testConfigure_withPermittedPath_shouldReturnOk() throws Exception {
        // Arrange
        FilterChainProxy springSecurityFilterChain = new FilterChainProxy(
                SecurityFilterChain.builder().addFilter(httpSecurity).build()
        );
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(springSecurityFilterChain).build();

        // Act & Assert
        mockMvc.perform(get("/showReg")).andExpect(status().isOk());
        mockMvc.perform(get("/index.html")).andExpect(status().isOk());
        mockMvc.perform(get("/login")).andExpect(status().isOk());
    }

    @Test
    public void testConfigure_withRestrictedPath_shouldReturnUnauthorized() throws Exception {
        // Arrange
        FilterChainProxy springSecurityFilterChain = new FilterChainProxy(
                SecurityFilterChain.builder().addFilter(httpSecurity).build()
        );
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(springSecurityFilterChain).build();

        // Act & Assert
        mockMvc.perform(get("/admin/showAddFlight")).andExpect(status().isUnauthorized());
        mockMvc.perform(get("/admin/admin/addFlight")).andExpect(status().isUnauthorized());
    }
}
