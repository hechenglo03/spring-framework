package org.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class BeforeBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("beanClass:"+beanClass.getName());
		System.out.println("beanName:"+beanName);
		return null;
	}
}
