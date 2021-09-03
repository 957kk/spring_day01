package com.zxk.controller;

import com.zxk.config.SpringConfig;
import com.zxk.domain.Account;
import com.zxk.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.List;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-02 14:57
 **/
public class Test01 {
    public static void main(String[] args) {
        //method1();
        ApplicationContext cac = new AnnotationConfigApplicationContext(SpringConfig.class);
       cac.getBean("dataSource");

    }

    private static void method1() {
        ApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) cac.getBean("accountService");
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
