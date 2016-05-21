package com.golem765.dao;

import com.golem765.model.User;

import java.util.List;

/**
 * Created by Дмитрий Гринец on 21.05.2016.
 */
public interface UserDao {
    User findById(int id);

    void saveUser(User user);
    void deleteUserById(Integer id);
    List<User> findAllUsers();
    List<User> finaAllUsersByName(String name);
    List<User> finaAllUsersByAge(Integer age);
}
