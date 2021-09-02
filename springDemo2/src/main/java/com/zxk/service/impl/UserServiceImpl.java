package com.zxk.service.impl;

import com.zxk.dao.UserDao;
import com.zxk.service.UserService;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 21:10
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private int num;

    public UserServiceImpl(UserDao userDao, int num) {
        this.userDao = userDao;
        this.num = num;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void save() {
        System.out.println("save......"+num);
        userDao.save();
    }
}
