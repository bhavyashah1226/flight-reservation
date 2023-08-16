package com.flightreservation.flightreservation.domains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Role_setUsers_b5a92adf02_Test {

    private Role role;
    private Set<User> users;

    @Before
    public void setUp() {
        role = new Role();
        users = new HashSet<>();
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        users.add(user1);
        users.add(user2);
    }

    @Test
    public void testSetUsers() {
        role.setUsers(users);
        Assert.assertEquals(users, role.getUsers());
    }

    @Test
    public void testSetUsersWithEmptySet() {
        Set<User> emptySet = new HashSet<>();
        role.setUsers(emptySet);
        Assert.assertEquals(emptySet, role.getUsers());
    }
}
