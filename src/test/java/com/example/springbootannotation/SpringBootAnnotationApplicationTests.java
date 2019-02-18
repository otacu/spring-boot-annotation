package com.example.springbootannotation;

import com.example.springbootannotation.configuration.MyConfiguration2;
import com.example.springbootannotation.pojo.Cat;
import com.example.springbootannotation.pojo.Dog;
import com.example.springbootannotation.properties.MailProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAnnotationApplicationTests {


	@Autowired
	@Qualifier("catList")
	private List<Cat> catList;


	@Autowired
	private Dog dog;

	@Autowired
	private MailProperties mailProperties;

	/*@Autowired
	@Qualifier("myMap")
	private Map map;*/

	@Test
	public void contextLoads() {
//		System.out.println(map);
		System.out.println(catList);
		System.out.println(dog);
		System.out.println(mailProperties);
	}

}
