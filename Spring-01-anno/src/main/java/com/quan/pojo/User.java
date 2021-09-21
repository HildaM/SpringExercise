package com.quan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/18 15:23
 */

// 等价于：<bean id="user" class="com.quan.pojo.User"/>
@Component
@Scope("prototype")
public class User {

    // 相当于：<property name="name" value="Hilda"/>
    @Value("Hilda")
    public String name;

    // 相当于：<property name="name" value="Hilda"/>
    @Value("Hilda")
    public void setName(String name) {
        this.name = name;
    }
}
