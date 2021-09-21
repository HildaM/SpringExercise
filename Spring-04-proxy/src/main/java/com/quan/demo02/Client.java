package com.quan.demo02;

/**
 * @ClassName: Client
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 11:16
 */


// 改动原有的代码，在公司中是大忌！！！

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserSerciveProxy proxy = new UserSerciveProxy();
        proxy.setUserService(userService);

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
