package com.cimpapps.hello;

import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean {
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//this method will perform after the bean initialization
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("The been is fully set and ready to ROCK!!!");
		
	}
	
	
}
