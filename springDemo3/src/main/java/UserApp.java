import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.zxk.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLException;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 18:34
 **/
public class UserApp {
    public static void main(String[] args) throws SQLException {
        method1();
        //method2();
        //method3();
    }

    private static void method3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }

    private static void method2() {
        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory xmlBeanFactory = new XmlBeanFactory(res);
        UserService userService = (UserService) xmlBeanFactory.getBean("userService");
    }

    private static void method1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
