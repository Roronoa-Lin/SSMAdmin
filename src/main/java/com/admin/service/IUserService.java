package com.admin.service;


import com.admin.entity.User;

import java.util.List;

public interface IUserService<T> {
    int login(String mail,String password);
    User user(String mail, String password);
    List<T> listall();
    void adduser(String mail,String name,String password);
    int testcount();
}
