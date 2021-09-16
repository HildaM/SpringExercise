package com.quan.MultiClassTest.Utils;

/**
 * @ClassName: UserDaoOracleImpl
 * @Description: Oracle数据库
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:48
 */
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("UserDaoOracleImpl ---- Oracle数据库");
    }
}
