package com.zxk.service.impl;

import com.zxk.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-04 09:41
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void show(int i) {
        System.out.println("service..." + i);
    }

    @Override
    public Integer a() {
        System.out.println("a");
        return 100;
    }

    @Override
    public void b() {
        System.out.println("bbbbbb");
        int i = 1 / 0;
    }
}
