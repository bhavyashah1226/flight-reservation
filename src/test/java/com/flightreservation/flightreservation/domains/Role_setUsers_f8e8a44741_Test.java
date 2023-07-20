package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Role_setUsers_f8e8a44741_Test {

    @Mock
    private Role role;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        role = new Role();
    }

    @Test
    public void testSetUsers() {
        Set<User> users = new HashSet<>();
        User user1 = new User();
        user1.setUsername("TestUser1");
        users.add(user1);

        User user2 = new User();
        user2.setUsername("TestUser2");
        users.add(user2);

        role.setUsers(users);
        assertEquals(users, role.getUsers());
    }

    @Test
    public void testSetUsersWithNull() {
        assertThrows(NullPointerException.class, () -> {
            role.setUsers(null);
        });
    }
}
