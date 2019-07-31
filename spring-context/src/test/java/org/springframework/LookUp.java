package org.springframework;

public class LookUp {

	public Student getStudent(){
		Student student = new Student();
		student.setId(1L);
		student.setAddress("one");
		student.setName("yi");
		return student;
	}
}
