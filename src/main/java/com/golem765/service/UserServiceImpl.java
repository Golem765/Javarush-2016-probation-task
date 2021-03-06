package com.golem765.service;


import com.golem765.dao.UserDao;
import com.golem765.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Дмитрий Гринец on 21.05.2016.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        User entity = dao.findById(user.getId());
        if(entity!=null)
        {
            entity.setisAdmin(user.getisAdmin());
            entity.setName(user.getName());
            entity.setAge(user.getAge());
        }
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return dao.findAllUsers();
    }

    @Override
    public boolean isIdUnique(Integer id, User user) {
        User user1 = findById(id);
        return user1 == null||user1.getId()==user.getId();
    }

    @Override
    public boolean isIdUniqueForRegistration(Integer id) {
        return findById(id)==null;
    }

    @Override
    public List<User> getAllUsersByName(String name) {
        return dao.finaAllUsersByName(name);
    }

    @Override
    public List<User> getAllUsersByAge(Integer age) {
        return dao.finaAllUsersByAge(age);
    }
}
