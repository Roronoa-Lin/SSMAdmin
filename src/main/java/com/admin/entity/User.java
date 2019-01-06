package com.admin.entity;

public class User {
    private int id;
    private String mail;
    private String name;
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
