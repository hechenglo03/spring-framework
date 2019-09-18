package org.springframework;

/**
 * @Author: hechenglo03
 * @Date:2019/8/25
 * @Description:
 */
public class Address {

	private String name;

	private Long id;

	private Student student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString(){
		return student.toString();
	}

	public void Aop(){
		System.out.println("AOP");
	}
}
