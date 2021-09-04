package com.zxk.service.impl;

import com.zxk.service.UserService;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-04 09:41
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void show() {
        System.out.println("service...");
    }

    @Override
    public void a() {
        System.out.println("aaaa");
    }
}
