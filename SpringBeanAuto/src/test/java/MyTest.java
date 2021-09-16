import com.quan.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Description: 测试类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/16 20:30
 */
public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
        System.out.println(people);
    }
}
