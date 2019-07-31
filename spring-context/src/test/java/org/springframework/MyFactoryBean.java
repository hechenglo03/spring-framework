package org.springframework;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Student> {
	private Student student = new Student();

	@Override
	public Student getObject() throws Exception {
		return student;
	}

	@Override
	public Class<Student> getObjectType() {
		return Student.class;
	}
}
