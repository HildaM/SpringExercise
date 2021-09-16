package MyTest;

import com.quan.MultiClassTest.service.UserServiceImpl;
import com.quan.springtest.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test
 * @Description: 测试类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:12
 */
public class test {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("MultiClassTest_Beans.xml");

        // 我们的对象现在都在Spring中管理了，我们要使用，就直接往里面取出来即可
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("u4");
        userServiceImpl.getUser();

//        UserServiceImpl user = (UserServiceImpl) context.getBean("user");
//        user.getUser();
    }
}
