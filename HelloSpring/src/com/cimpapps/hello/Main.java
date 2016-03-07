package com.cimpapps.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Friendly helloWorld = (Friendly) context.getBean("helloWorld");
		helloWorld.sayHello();
		
		Friendly helloRomania = (Friendly) context.getBean("helloRomania");
		helloRomania.sayHello();
		
		
		context.registerShutdownHook();
	
	}
}
