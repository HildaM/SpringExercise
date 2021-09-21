package com.quan.config;

import com.quan.pojo.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: Config2
 * @Description: 配置类2
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 9:41
 */

@Configuration
public class Config2 {

    @Bean
    public User2 getUser2() {
        return new User2();
    }
}
