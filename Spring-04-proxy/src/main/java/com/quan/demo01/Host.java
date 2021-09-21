package com.quan.demo01;

/**
 * @ClassName: Host
 * @Description: 房东类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 10:49
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
