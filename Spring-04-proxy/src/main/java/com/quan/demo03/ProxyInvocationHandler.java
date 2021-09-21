package com.quan.demo03;

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
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 动态生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this
        );
    }



    // 处理代理实例，并返回结果
    // 动态代理的本质，就是使用反射机制实现
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }


    public void seeHouse() {
        System.out.println("中介带看房");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
