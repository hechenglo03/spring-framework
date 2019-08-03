package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author hechenglong
 * @Date 2019/7/14
 * @Description
 **/

public class Application {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student)context.getBean("student");
		Person  person = (Person) context.getBean("person");
		System.out.println(student);
	}

}
