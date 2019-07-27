package org.springframework;

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
		TestEvent event = new TestEvent("one");
		context.publishEvent(event);
	}

}
