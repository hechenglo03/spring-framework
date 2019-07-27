package org.springframework;

import java.util.List;

/**
 * @Author hechenglong
 * @Date 2019/7/14
 * @Description
 **/

public class Student {

	private Long id;

	private String name;

	private String address;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(){

	}

	public Student(Long id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString(){
		return this.id+"----"+this.name+"---------"+this.address;
	}
}
