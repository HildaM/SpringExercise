package com.quan.MultiClassTest.Utils;

/**
 * @ClassName: UserDaoMysqlImpl
 * @Description: Mysql
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:47
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("UserDaoMysqlImpl --- Mysql数据库");
    }
}
