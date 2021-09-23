package com.quan.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyInvocationHandler
 * @Description: 代理处理程序
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 14:40
 */

// 用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
//                target.getClass().getClassLoader(),  这样也可以！！！
                target.getClass().getInterfaces(),
                this
        );
    }


    // 处理代理实例，并返回结果
    // 动态代理的本质，就是使用反射机制实现
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }


    public void log(String msg) {
        System.out.println("执行了 " + msg + " 方法");
    }
}
