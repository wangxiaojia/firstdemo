package com.example.firstdemo.service;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: wxj
 * @Date: 2022/3/4 18:23
 */
@Service
public class UserServiceImpl implements UserService{


    @Resource
    UserRepository userRepository;

    @Cacheable(cacheNames = "user", condition = "#id>0", unless = "#result==null")
    @Override
    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }


    @Override
    public User getUserByName(String username) {
        return userRepository.findByUsername(username);
    }
}
