package com.quan.pojo;

/**
 * @ClassName: Address
 * @Description: 学生地址 ---- 引用对象
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/16 14:56
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
