package com.zxk.config;

import com.zxk.config.filter.MyTypeFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-02 17:03
 **/
@Configuration
//@ComponentScan("com.zxk")
/*@ComponentScan(
        value = "com.zxk",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Service.class
        ))*/
@ComponentScan(
        value = "com.zxk",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.CUSTOM,
                classes = MyTypeFilter.class
        ))
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
