package com.zxk.service.impl;

import com.zxk.dao.UserDao;
import com.zxk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 21:10
 **/
@Component("userService")
@PropertySource(value = {"classpath:test.properties"},ignoreResourceNotFound = true)
public class UserServiceImpl implements UserService {

    @Value("${usernme}")
    private String username;
    @Value("${password}")
    private String password;

    @Autowired
    private UserDao userDao;
    @Value("22")
    private int num;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void save() {
        System.out.println("save......" + num + "," + username + "," + password);
        userDao.save();
    }
}
