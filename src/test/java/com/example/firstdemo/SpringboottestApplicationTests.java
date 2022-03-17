package com.example.firstdemo;


import com.example.firstdemo.bean.User;

import com.example.firstdemo.dao.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringboottestApplicationTests {

    @Resource
    UserRepository userRepository;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testDao() {
        Optional<User> optional = userRepository.findById(2);
        System.out.println("获取用户成功>>" + optional.get().getNickName());
    }



}
