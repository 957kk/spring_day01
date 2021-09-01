package com.zxk.service.impl;

import com.zxk.service.UserService;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 18:30
 **/
public class UserServiceImpl implements UserService {
    public UserServiceImpl(){
        System.out.println("构造方法");
    }
    @Override
    public void save() {
        System.out.println("zzzz");
    }
}
