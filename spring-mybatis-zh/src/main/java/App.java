import com.itheima.sm.domain.Account;
import com.itheima.sm.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author byZhao
 * @Modify 2021/9/4 18:53
 * Talk is cheap. Show me the code.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        Account account = new Account();
        account.setId(10001L);
        account.setName("赵飞虎");
        account.setMoney(10000000.99);
        accountService.save(account);
    }

}
