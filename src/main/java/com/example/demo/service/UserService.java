package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    /*
    * 根据用户名查询用户
    * */
    User findByUserName(String userName);

    /*
    *根据用户名和密码查询用户
    */
    User findByUserNameAndPassword(String userName, String Password);
}
