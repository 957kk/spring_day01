package com.zxk.service;

import com.zxk.config.SpringConfig;
import com.zxk.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-03 08:53
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccoutServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void findAllTest(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
