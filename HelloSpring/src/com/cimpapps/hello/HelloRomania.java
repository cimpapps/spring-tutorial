package com.cimpapps.hello;

public class HelloRomania implements Friendly {
	
	private String message1;
	private String message2;
	private String message3;
	
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	@Override
	public void sayHello() {
		System.out.println();
		System.out.println("Saluta pe romaneste:");
		System.out.println(this.getMessage1());
		System.out.println(this.getMessage2());
		System.out.println(this.getMessage3());
		System.out.println();
		
	}
}
