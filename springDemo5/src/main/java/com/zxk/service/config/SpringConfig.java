package com.zxk.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-06 11:11
 **/
@Configuration
@ComponentScan("com.zxk")
@EnableAspectJAutoProxy
public class SpringConfig {
}
