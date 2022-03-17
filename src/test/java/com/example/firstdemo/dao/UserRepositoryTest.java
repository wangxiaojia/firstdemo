package com.example.firstdemo.dao;
import com.example.firstdemo.bean.User;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.Optional;
/**
 * @Author: wxj
 * @Date: 2022/3/3 10:17
 */
class UserRepositoryTest {

    @Resource
    UserRepository userRepository;
    @Test
    void getUser() {
        Optional<User> optional =userRepository.findById(2);
        System.out.println("获取用户成功》》"+optional.get().getNickName());
    }
}