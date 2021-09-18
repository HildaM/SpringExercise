import com.quan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description: 测试类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/18 15:27
 */
public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans9-18.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
