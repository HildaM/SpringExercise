package com.quan.demo02;

/**
 * @ClassName: UserServiceImpl
 * @Description: 业务接口实现类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 11:14
 */

// 真实对象
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("查询了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
