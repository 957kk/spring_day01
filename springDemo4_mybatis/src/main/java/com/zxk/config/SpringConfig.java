package com.zxk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-02 17:03
 **/
@Configuration
@ComponentScan("com.zxk")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class,MybatisConfig.class})
public class SpringConfig {
}
