import com.quan.config.Config;
import com.quan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description: 测试类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 9:25
 */
public class MyTest {

    @Test
    public void test01() {
        // 此处填入的参数为自己定义的配置类！
        // 如果完全使用配置类方式，就只能通过 new AnnotationConfigApplicationContext(Config.class) 来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("getUser", User.class);  // 获取对象，就获取类里面的方法名
        System.out.println(user.getName());
    }
}
