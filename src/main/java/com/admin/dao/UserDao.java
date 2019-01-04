package com.admin.dao;

import com.admin.entity.User;

public interface UserDao<T> {
    int login(String mail,String password);
    User user(String mail,String password);
}
