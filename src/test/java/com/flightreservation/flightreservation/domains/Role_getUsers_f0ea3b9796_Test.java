package com.flightreservation.flightreservation.domains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class Role_getUsers_f0ea3b9796_Test {

    @InjectMocks
    private Role role;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUsersWhenUsersIsNull() {
        Set<User> result = role.getUsers();
        assertEquals(null, result, "Users set should be null");
    }

    @Test
    public void testGetUsersWhenUsersIsNotEmpty() {
        Set<User> users = new HashSet<>();
        User user1 = new User();
        user1.setUsername("user1");
        users.add(user1);

        User user2 = new User();
        user2.setUsername("user2");
        users.add(user2);

        role.setUsers(users);

        Set<User> result = role.getUsers();
        assertEquals(users, result, "Users set should be equal to the set that was set");
    }
}
