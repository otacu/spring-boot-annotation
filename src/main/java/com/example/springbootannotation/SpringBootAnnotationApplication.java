package com.example.springbootannotation;

import com.example.springbootannotation.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;
import java.util.Map;

@SpringBootApplication
public class SpringBootAnnotationApplication {

    @Autowired
    private Cat cat;

	@Resource(name = "myMap")
	private Map map;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAnnotationApplication.class, args);
		/*Map myMap = (Map) context.getBean("myMap");
		System.out.println(myMap);
		Cat cat =  context.getBean(Cat.class);
		System.out.println(cat);*/
	}
}
