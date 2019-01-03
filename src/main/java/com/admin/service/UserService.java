package com.admin.service;


import com.admin.dao.UserDao;
import com.admin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService<User> {
    @Autowired
    private UserDao<User> userDao;
    @Override
    public int login(String mail,String password) {
        return userDao.login(mail,password);
    }
}
