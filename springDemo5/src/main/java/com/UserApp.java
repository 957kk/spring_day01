package com;

import com.zxk.service.UserService;
import com.zxk.service.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-04 10:03
 **/
public class UserApp {
    public static void main(String[] args) {
        //ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext act = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) act.getBean("userService");
        //userService.show(500);
        //userService.a();
        userService.b();
    }
}
