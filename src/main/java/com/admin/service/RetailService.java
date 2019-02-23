package com.admin.service;

import com.admin.entity.Retail;
import com.admin.oracledao.RetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailService implements IRetailService<Retail> {
    @Autowired
    private RetailDao retaildao;
    @Override
    public List<Retail> Customersum(){
        return retaildao.Customersum();
    }
}
