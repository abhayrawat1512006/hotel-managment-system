package com.hotelparadise.service;

import com.hotelparadise.models.HotelEntities.User;
import com.hotelparadise.dao.UserDao;
import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void createUser(User user) {
        userDao.saveUser(user);
    }
}
