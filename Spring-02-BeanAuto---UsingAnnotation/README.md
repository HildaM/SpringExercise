## 学习内容
1. 掌握使用注解的方法

## 模块实现目的
1. 完全使用注解重构 SpringBeanAuto 的代码，使 xml 的配置简化

### 原版
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 指定要扫描的包，这个包下的注解就会生效 -->
    <context:component-scan base-package="com.quan.pojo"/>
    <context:annotation-config/>

    <bean id="cat" class="com.quan.pojo.Cat"/>
    <bean id="cat111" class="com.quan.pojo.Cat"/>

    <bean id="dog" class="com.quan.pojo.Dog"/>

    <!--
        byname：会自动在容器上下文中查找，和自己对象 set 方法后面的值对应的 beanid
    -->
    <bean id="people" class="com.quan.pojo.People" autowire="byType">
        <property name="name" value="Hilda_quan"/>
        <!-- <property name="dog" ref="dog"/> -->
        <!-- <property name="cat" ref="cat"/> -->
    </bean>


</beans>
```


### 使用注解开发后
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 指定要扫描的包，这个包下的注解就会生效 -->
    <context:component-scan base-package="com.quan"/>
    <!-- 注解的支持 -->
    <context:annotation-config/>

</beans>
```

> 可以看见：修改后的xml文件配置简化了非常多
 
