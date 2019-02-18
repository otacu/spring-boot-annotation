package com.example.springbootannotation.configuration;

import com.example.springbootannotation.pojo.Cat;
import com.example.springbootannotation.properties.MailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *@author  strom
 */
@Configuration
@ComponentScan(basePackages = "com.exclude.example") //你也可以使用 @ComponentScan 注解自动收集所有的Spring组件，包括 @Configuration 类。
public class MyConfiguration {

    @Autowired
    private MailProperties mailProperties;

    @Bean
    public Map<String, Object> myMap() {
        Map<String, Object>  map = new ConcurrentHashMap<>();
        map.put("tom", 18);
        map.put("strom", 25);
        System.out.println("myMap:"  + map);
        return map;
    }


    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("lility");
        cat.setColor("black");
        System.out.println(cat);
        return cat;
    }
}
