package com.quan.pojo;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: People
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/18 16:21
 */

@Component
@Scope("singleton")   // 单例模式
public class People {
    @Autowired       // <property name="cat" ref="cat"/>
    private Cat cat;

    @Autowired       // <property name="dog" ref="dog"/>
    private Dog dog;

    @Value("Hilda_quan")
    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
