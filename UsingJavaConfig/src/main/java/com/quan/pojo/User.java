package com.quan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: User
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 9:20
 */

// 这里的注解表示了：这个类被spring接管了，注册到了容器中
@Controller
public class User {
    private String name;

    public String getName() {
        return name;
    }

    // 属性注入值
    @Value("Hilda")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
