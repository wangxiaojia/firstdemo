package com.example.firstdemo.service;

import com.example.firstdemo.bean.User;

/**
 * @Author: wxj
 * @Date: 2022/3/4 18:11
 */
public interface UserService {
    User getUserById(Integer id);
    User getUserByName(String username);

}
