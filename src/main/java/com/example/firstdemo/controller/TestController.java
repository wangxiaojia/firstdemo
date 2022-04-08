package com.example.firstdemo.controller;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import com.example.firstdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: wxj
 * @Date: 2022/2/18 11:56
 */
@Controller
@RequestMapping("/test")
@Api(tags = "用户信息管理")
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/wangbadan", method = RequestMethod.GET)
    @ResponseBody
    public String wangbadan() {
        return "wbd";
    }

    @ResponseBody
    @RequestMapping(value = "/zylwbd", method = RequestMethod.GET)
    public String zylwbd() {
        return "zylwbd";
    }

    @GetMapping(value = "{id}")
    @ApiOperation("根据ID查询用户")
    @ResponseBody
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("query")
    @ApiOperation("根据姓名查询用户")
    @ResponseBody
    public User getUserByName(User user) {
        return userService.getUserByName(user.getUserName());
    }
}
