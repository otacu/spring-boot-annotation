package com.example.springbootannotation.configuration;

import com.example.springbootannotation.pojo.Cat;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Configuration
// @Import(MyConfiguration.class)  //@import 和@importResource　都是导入另外一个配置。
// @ImportResource("classpath:cons-injec.xml") //导入xml配置项
@ConfigurationProperties
public class MyConfiguration2 {


    @Bean
    public List<Cat> catList (Cat cat) {
        List<Cat> catList = new ArrayList<>();
        catList.add(cat);
        return catList;
    }

}
