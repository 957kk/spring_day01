package com.zxk.factory;

import com.zxk.service.UserService;
import com.zxk.service.impl.UserServiceImpl;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 18:50
 **/
public class UserServiceFactory2 {
    public  UserService getService(){
        System.out.println("实例工厂创建ffffd");
        return new UserServiceImpl();
    }
}
