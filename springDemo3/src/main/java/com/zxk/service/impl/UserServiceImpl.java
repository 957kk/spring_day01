package com.zxk.service.impl;

import com.zxk.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 21:10
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Value("zs")
    private String username;
    @Value("111")
    private String pwd;


    public UserServiceImpl(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
        System.out.println("有参构造方法");
    }

    public UserServiceImpl() {
        System.out.println("无参构造方法");
    }

    @Override
    public void save() {
        System.out.println("save......" + username + "," + pwd);

    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return pwd;
    }
}
