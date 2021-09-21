package com.quan.demo01;

/**
 * @ClassName: Proxy
 * @Description: 中介（代理角色）
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 10:51
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    // 代理房东租房子
    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    // 合同
    public void hetong() {
        System.out.println("签合同");
    }
}
