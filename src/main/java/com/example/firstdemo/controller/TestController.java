package com.example.firstdemo.controller;

import com.example.firstdemo.bean.User;
import com.example.firstdemo.dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: wxj
 * @Date: 2022/2/18 11:56
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/wangbadan",method = RequestMethod.GET)
    @ResponseBody
    public String wangbadan(){
        return "wbd";
    }

    @ResponseBody
    @RequestMapping(value = "/zylwbd",method = RequestMethod.GET)
    public String zylwbd(){
        return "zylwbd";
    }

}
