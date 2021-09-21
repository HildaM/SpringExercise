package com.quan.config;

import com.quan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName: Config
 * @Description: java 配置类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/9/21 9:22
 */


// 这个也会被Spring托管，注册到容器中，因为它本来就是一个 @Component
    // @Configuration：代表一个配置类，就和我们之前看到的 beans.xml 是一样的！

@Configuration
@ComponentScan("com.quan")   // 扫描包。等价与在xml做的工作
@Import(Config2.class)     // 相当于在xml中import其他xml配置文件
public class Config {

    // 注册一个bean：就相当于我们之前在xml写的bean标签
    // 这个方法的名字，就相当于bean标签中的id属性    （User getUser()中的getUser）
    // 方法的返回值，就相当于bean标签中的class属性  （User getUser()中的User）
    @Bean
    public User getUser() {
        return new User();  // 就是返回要注入的bean的对象
    }
}
