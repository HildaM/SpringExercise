package com.quan.demo04;

import com.quan.demo02.UserService;
import com.quan.demo02.UserServiceImpl;

/**
 * @ClassName: Client
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 15:16
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置代理对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();

    }
}
