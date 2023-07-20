package com.flightreservation.flightreservation.domains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Role_getUsers_6fff12e657_Test {

    @InjectMocks
    private Role role;

    private Set<User> users = new HashSet<>();

    @Mock
    private User user1;

    @Mock
    private User user2;

    @Before
    public void setup() {
        when(user1.getUsername()).thenReturn("user1");
        when(user2.getUsername()).thenReturn("user2");
        users.add(user1);
        users.add(user2);

        role.setUsers(users);
    }

    @Test
    public void testGetUsers_Success() {
        Set<User> result = role.getUsers();
        assertEquals(users, result);
    }

    @Test
    public void testGetUsers_Failure() {
        Set<User> wrongUsers = new HashSet<>();
        User user3 = new User();
        user3.setUsername("user3");
        wrongUsers.add(user3);

        Set<User> result = role.getUsers();
        assertEquals(false, wrongUsers.equals(result));
    }
}
