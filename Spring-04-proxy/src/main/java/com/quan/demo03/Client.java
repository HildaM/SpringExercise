package com.quan.demo03;

/**
 * @ClassName: Client
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 14:47
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色，来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();  // 获得代理类：这里的proxy就是动态生成的，我们并没有写
        proxy.rent();   // 通过代理去调用方法
    }
}
