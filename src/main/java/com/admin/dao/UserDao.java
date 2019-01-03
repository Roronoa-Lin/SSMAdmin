package com.admin.dao;

public interface UserDao<T> {
    int login(String mail,String password);
}
