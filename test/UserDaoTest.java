package com.hotelparadise.dao;

import com.hotelparadise.models.HotelEntities.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDaoTest {
    private UserDao userDao;

    @Before
    public void setUp() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void testSaveUser() {
        User user = new User(1, "John Doe", "john@example.com", "1234567890", "password123");
        userDao.saveUser(user);
        assertNotNull(userDao.getUserById(1));
    }

    @Test
    public void testGetAllUsers() {
        User user1 = new User(1, "John Doe", "john@example.com", "1234567890", "password123");
        User user2 = new User(2, "Jane Doe", "jane@example.com", "0987654321", "password456");
        userDao.saveUser(user1);
        userDao.saveUser(user2);

        assertEquals(2, userDao.getAllUsers().size());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(1, "John Doe", "john@example.com", "1234567890", "password123");
        userDao.saveUser(user);
        userDao.deleteUser(1);

        assertNull(userDao.getUserById(1));
    }
}
