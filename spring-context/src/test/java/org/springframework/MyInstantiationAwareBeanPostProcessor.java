package org.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @Author: hechenglo03
 * @Date:2019/9/4
 * @Description:
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	public  Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException{

		System.out.println("beanClass: "+beanClass.getName());
		System.out.println("beanName: "+beanName);
		System.out.println("---------------------------");
		return null;
	}

	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"-----------------------"+bean);
		return false;
	}


}
