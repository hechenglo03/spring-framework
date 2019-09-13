package org.springframework;

import java.util.List;
import java.util.Optional;

/**
 * @Author hechenglong
 * @Date 2019/7/21
 * @Description
 **/
@One
public class Person {

	private Student student;

	private Address address;

	private Optional<String> optional;

	public Person(Student student){
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Optional getOptional() {
		return optional;
	}

	public void setOptional(Optional optional) {
		this.optional = optional;
	}
}
