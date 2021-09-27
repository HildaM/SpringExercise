import com.quan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/27 22:57
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");
        UserService userServiceImpl = context.getBean("userService", UserService.class);
        userServiceImpl.add();
    }
}
