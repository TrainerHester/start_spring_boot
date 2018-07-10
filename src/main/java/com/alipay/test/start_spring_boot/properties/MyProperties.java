package com.alipay.test.start_spring_boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dly on 2018/7/10
 */
@Component
@ConfigurationProperties(prefix = "my1")
public class MyProperties {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
