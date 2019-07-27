package com.hcl.Test;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hechenglong
 * @Date 2019/7/14
 * @Description
 **/

public class Application {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
