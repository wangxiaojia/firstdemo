package com.example.firstdemo.controller;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: wxj
 * @Date: 2022/3/9 15:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @ResponseBody
    @GetMapping("/t/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @ResponseBody
    @GetMapping("/i/{username}")
    public User getUserByName(String usrname){
        return userService.getUserByName(usrname);
    }
}
