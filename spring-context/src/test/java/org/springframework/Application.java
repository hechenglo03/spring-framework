package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author hechenglong
 * @Date 2019/7/14
 * @Description
 * 加不加/不影响resource在classpath下
 **/

public class Application {

	public static class MyContext extends ClassPathXmlApplicationContext{

		public MyContext(String path){
			super(path);
		}

		public String resolvepathM(String path){
			return this.resolvePath(path);
		}
	}


	public static void main(String[] args){
		MyContext context = new MyContext("bean.xml");
		System.out.println(context.resolvepathM("{path}"));

	}

}
