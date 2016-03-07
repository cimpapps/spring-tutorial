package com.cimpapps.hello;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements DisposableBean{
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	private void init() {
		
		System.out.println("The bean is ready to ROCK!");
	}
	
	//we can provide a method to be called when destroying the bean by Implementing the DisposableBean or
	//we can do as for init-method config also for destroy-method in XML
	@Override
	public void destroy() throws Exception {
		System.out.println("The bean has been disposed!");
		
	}
	
}
