package com.zxk.dao.impl;

import com.zxk.dao.UserDao;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 21:13
 **/
public class UserDaoImpl implements UserDao {
    private String username;
    private String pwd;

    public UserDaoImpl(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public void save() {
        System.out.println("我可以了"+","+username+","+pwd);
    }
}
