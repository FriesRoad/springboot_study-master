package com.test.course10_demo.service;


import com.test.course10_demo.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);
    List<User> getAll();
    User getUserByName(String name);
    User getUser(Long id, String name);
}