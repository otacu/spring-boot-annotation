package com.exclude.example;

import com.example.springbootannotation.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyExcludeConfiguration2 {

    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("旺财");
        System.out.println(dog);
        return dog;
    }
}
