package com.quan.log;

import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: beforeLog
 * @Description: 事前通知
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/27 22:45
 */
public class beforeLog implements MethodBeforeAdvice, Advice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+" 的 "+method.getName()+" 方法被执行了！");
    }
}
