package com.quan.demo01;

/**
 * @ClassName: Client
 * @Description: 租客
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 10:50
 */
public class Client {
    public static void main(String[] args) {
        // 房东想要出租房子
        Host host = new Host();
        // 中介帮房东租房子，代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
