package com.admin.service;

import com.admin.oracledao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Autowired
    private TestDao testDao;
    @Override
    public int countstore(){
        return testDao.countstore();
    }
}
