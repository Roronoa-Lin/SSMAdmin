package com.admin.service;


public interface IUserService<T> {
    int login(String mail,String password);
}
