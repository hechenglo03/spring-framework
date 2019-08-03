package org.springframework;

public class Factory {

	public Student getStudent(String name,String address,Long id){
		Student student = new Student();
		student.setId(id);
		student.setAddress(address);
		student.setName(name);
		return student;
	}

	public String getStudent(String name,String address,Long id,double dot){
		return "ONE";
	}
}
