package org.springframework;

import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.TestListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.Spr7283Tests;
import org.springframework.core.ResolvableType;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

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

		public String resolvepath(String ...message){
			return " ";
		}

		@Override
		public void onRefresh(){
			this.publishEvent(new MyApplicationEvent(""));
		}


		protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
			super.initBeanDefinitionReader(reader);
			reader.setEventListener(new MyReaderEventListener());
		}
	}

	public static class ParameterizedBean< T extends String>{
		private List<T> list;

		private T[] array;

		private List<? extends ArrayList> alist;
	}

	/**
	 * 说明路径搜索在test下搜索的
	 * @param args
	 */
	public static void main(String[] args) throws IntrospectionException, NoSuchFieldException, NoSuchMethodException {
//		ResolvableType resolvableType = ResolvableType.forField(ParameterizedBean.class.getDeclaredField("list"));
//		System.out.println(resolvableType.toClass().getName());
//		Field field = ParameterizedBean.class.getDeclaredField("array");
//		System.out.println(((GenericArrayType)field.getGenericType()).getGenericComponentType().getTypeName());
//		ParameterizedBean<String> parameterizedBean = new ParameterizedBean<String>();
//		ResolvableType resolvableType = ResolvableType.forClass(parameterizedBean.getClass());
//		for(ResolvableType resolvableType1:resolvableType.getGenerics()){
//			System.out.println(resolvableType1.toClass().getName());
//		}
//		MyInstantiationAwareBeanPostProcessor processor = new MyInstantiationAwareBeanPostProcessor();
		MyContext myContext = new MyContext("bean.xml");

		ObjectFactory<Address> objectFactory = myContext.getBeanProvider(Address.class);
		System.out.println(objectFactory.getObject());



//		context.start();
//		System.out.println("---------stop-------------");
//		context.stop();
//		System.out.println("--------------start----------");
//		context.start();
//		System.out.println( true || false && false);


	}

}
