package DynamicProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyTest
 * @Description: 动态代理举例
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/23 16:43
 */

interface Human {
    String getBelief();
    void eat(String food);
}


// 被代理类  ——  业务逻辑
class SuperMan implements Human {

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}
class Student implements Human {

    @Override
    public String getBelief() {
        return "I believe I can learn what I want!";
    }

    @Override
    public void eat(String food) {
        System.out.println("学生喜欢吃健康的食物");
    }
}

// 创建动态代理类
class ProxyFactory {
    // obj：被代理类的对象。
    // 调用此方法，返回一个代理类的对象（解决问题一）
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler hander = new MyInvocationHandler(obj);

        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                hander
        );
    }
}

class MyInvocationHandler implements InvocationHandler {
    // 被代理类，赋值时需要使用被代理类的对象
    private Object obj;

    public MyInvocationHandler() {
    }

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    // 当我们通过代理类的对象调用某一个方法时，就会自动地调用如下的方法
    // 将被代理类要执行的方法的功能，声明在invoke方法中即可！
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理类的对象的方法, 此方法即可作为被代理类调用的方法
        // obj：被代理类对象  args：方法的形参列表
        Object returnValue = method.invoke(obj, args);
        // 上述方法的返回值，作为invoke的返回值
        return returnValue;
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        // proxyInstance: 代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        // 当通过代理类调用方法时，会自动调用代理类中的同名方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("米饭");

        System.out.println("***********************");

        Student stu = new Student();
        Human stuProxy = (Human) ProxyFactory.getProxyInstance(stu);

        String belief1 = stuProxy.getBelief();
        System.out.println(belief1);
        stuProxy.eat("饭堂");
    }
}
