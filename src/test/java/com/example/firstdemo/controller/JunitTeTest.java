package com.example.firstdemo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: wxj
 * @Date: 2022/3/3 14:16
 */
class JunitTeTest {
    JunitTe junitTe =new JunitTe();

    @Test
    void add() {
    assertEquals(junitTe.add(2,3),5);
    }
}