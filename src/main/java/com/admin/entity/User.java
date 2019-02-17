package com.admin.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
    @JSONField(name = "ID")
    private int id;
    @JSONField(name = "MAIL")
    private String mail;
    @JSONField(name = "NAME")
    private String name;
    @JSONField(name = "PASSWORD")
    private String password;
    //无参构造
    public User(){
        super();
    }
    //有参构造
    public User(String mail,String password){
        this.mail=mail;
        this.password=password;
    }
    //有参构造
    public User(int id,String mail,String name,String password){
        this.id = id;
        this.mail=mail;
        this.name=name;
        this.password=password;
    }
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getMail(){return mail;}
    public void setMail(String mail){this.mail=mail;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getPassword(){return password;}
    public void setPassword(String password){
        this.password=password;
    }
}
