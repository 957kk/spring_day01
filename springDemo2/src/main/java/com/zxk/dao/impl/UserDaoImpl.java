package com.zxk.dao.impl;

import com.zxk.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 21:13
 **/
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Value("zs")
    private String username;
    @Value("111")
    private String pwd;


    @Override
    public void save() {
        System.out.println("我可以了" + "," + username + "," + pwd);
    }
}
