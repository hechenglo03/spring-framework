package org.springframework;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Student> {


	@Override
	public Student getObject() throws Exception {
		return new Student();
	}

	@Override
	public Class<Student> getObjectType() {
		return Student.class;
	}
}
