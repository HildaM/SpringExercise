package com.quan.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: afterLog
 * @Description: 事后通知
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/27 22:46
 */
public class afterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了 "+method.getName()+" 方法，返回值为 "+returnValue);
    }
}
