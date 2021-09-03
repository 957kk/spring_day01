import com.zxk.SpringConfig;
import com.zxk.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextd.xml");
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
