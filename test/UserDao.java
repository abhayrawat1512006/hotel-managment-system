package com.hotelparadise.dao;

import com.hotelparadise.models.HotelEntities.User;
import java.util.List;

public interface UserDao {
    User getUserById(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}
