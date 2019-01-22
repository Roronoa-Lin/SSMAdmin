package com.admin.service;


import com.admin.dao.UserDao;
import com.admin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService<User> {
    @Autowired
    private UserDao<User> userDao;
    @Override
    public int login(String mail,String password) {
        return userDao.login(mail,password);
    }
    @Override
    public User user(String mail,String password) {
        return userDao.user(mail,password);
    }
    @Override
    public List<User> listall() {
        return userDao.listall();
    }
    @Override
    public void adduser(String mail,String name,String password) {
         userDao.adduser(mail,name,password);
    }
    @Override
    public int testcount(){return userDao.testcount();}
}
