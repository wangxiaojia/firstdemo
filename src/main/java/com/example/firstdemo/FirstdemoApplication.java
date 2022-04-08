package com.example.firstdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//注释一下
@EnableCaching//启用缓存
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EntityScan("com.example.firstdemo")
@EnableJpaRepositories(basePackages = "com.example.firstdemo.dao")
public class FirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
    }

}
