package com.quan.MultiClassTest.Utils;

/**
 * @ClassName: UserDaoDeleteAll
 * @Description: 删库跑路
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:49
 */
public class UserDaoDeleteAll implements UserDao {
    @Override
    public void getUser() {
        System.out.println("删库跑路！！！你给路打油~~~");
    }
}
