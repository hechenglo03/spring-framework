package org.springframework;

public class SubStudent extends Student{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString(){
		return "one"+"two";
	}
}
