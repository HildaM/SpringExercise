package com.quan.diy;

/**
 * @ClassName: DIYAOP
 * @Description: 自定义切面
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/27 23:07
 */
public class DIYAOP {
    public void Before(){
        System.out.println("=====方法执行前=====");
    }

    public void After(){
        System.out.println("=====方法执行后=====");
    }
}
