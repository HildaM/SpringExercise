package com.quan.service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/27 22:44
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加了一个数据");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个数据");
    }

    @Override
    public void update() {
        System.out.println("更新了一个数据");
    }

    @Override
    public void select() {
        System.out.println("查询了一个数据");
    }
}
