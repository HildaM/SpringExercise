package com.quan.demo02;

/**
 * @ClassName: UserSerciveProxy
 * @Description: 代理角色
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 11:18
 */
public class UserSerciveProxy implements UserService {
    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    // 添加业务
    // 添加日志功能
    public void log(String msg) {
        System.out.println("[debug] 使用了 " + msg + " 方法");
    }
}
