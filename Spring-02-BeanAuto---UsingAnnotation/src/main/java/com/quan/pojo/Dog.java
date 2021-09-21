package com.quan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Dog
 * @Description: dog
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/18 16:21
 */

@Component
public class Dog {

    @Value("Jerry")
    private String name;

    public void shout() {
        System.out.println(this.name + "Wang~~~");
    }
}
