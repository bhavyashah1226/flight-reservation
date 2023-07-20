package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Role_setName_f5bd015150_Test {
  private Role role;

  @Mock
  private Set<GrantedAuthority> grantedAuthorities;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    role = new Role();
  }

  @Test
  public void testSetNameSuccess() {
    String expectedName = "ROLE_USER";
    role.setName(expectedName);
    assertEquals(expectedName, role.getName());
  }

  @Test
  public void testSetNameFailure() {
    String expectedName = null;
    role.setName(expectedName);
    assertEquals(expectedName, role.getName());
  }
}
