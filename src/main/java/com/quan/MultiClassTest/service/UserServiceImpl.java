package com.quan.MultiClassTest.service;

import com.quan.MultiClassTest.Utils.UserDao;

/**
 * @ClassName: UserService
 * @Description: 操作逻辑
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:51
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
