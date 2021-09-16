package com.quan.springtest;

/**
 * @ClassName: HelloSpring
 * @Description: Spring学习
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/12 10:01
 */
public class HelloSpring {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + str + '\'' +
                '}';
    }
}
