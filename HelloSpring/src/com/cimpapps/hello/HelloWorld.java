package com.cimpapps.hello;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements Friendly{
	
	private String message1;
	private String message2;
	
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
	@Override
	public void sayHello() {
		System.out.println();
		System.out.println("Say hello to everybody in the world: ");
		System.out.println(this.getMessage1());
		System.out.println(this.getMessage2());
		System.out.println();
	}
	
	
	
}
