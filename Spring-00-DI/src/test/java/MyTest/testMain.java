package MyTest;

import com.quan.pojo.Student;
import com.quan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: testMain
 * @Description: 测试类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/16 15:04
 */
public class testMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }


    @Test
    public void pNameSpaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        // 这里涉及到了反射的知识！
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user == user2);
        System.out.println(user.hashCode());

    }
}
