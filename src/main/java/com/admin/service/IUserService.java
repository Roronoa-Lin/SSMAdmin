package com.admin.service;


import com.admin.entity.User;

public interface IUserService<T> {
    int login(String mail,String password);
    User user(String mail, String password);
}
