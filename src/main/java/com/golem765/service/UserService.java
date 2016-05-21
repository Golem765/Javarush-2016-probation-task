package com.golem765.service;

import com.golem765.model.User;

import java.util.List;

/**
 * Created by Дмитрий Гринец on 21.05.2016.
 */
public interface UserService {
    User findById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteById(Integer id);
    List<User> getAllUsers();
    List<User> getAllUsersByName(String name);
    List<User> getAllUsersByAge(Integer age);
    boolean isIdUnique(Integer id, User user);
    boolean isIdUniqueForRegistration(Integer id);
}
