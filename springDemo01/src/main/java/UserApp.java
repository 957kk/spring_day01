import com.zxk.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-01 18:34
 **/
public class UserApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService2");
        UserService userService2 = (UserService) ctx.getBean("userServiceFactory");
        UserService userService3 = (UserService) ctx.getBean("usf3");
        userService3.save();
    }
}
