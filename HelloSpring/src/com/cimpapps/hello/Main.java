package com.cimpapps.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Demo of Singleton Scope...we will have 2 ref vars pointing to the same object
		//the getBean() method will return each time same object
		HelloWorld singletonObj1 = (HelloWorld) context.getBean("helloWorld");
		singletonObj1.setMessage("Hello World!");
		HelloWorld singletonObj2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(singletonObj1.getMessage());
		System.out.println(singletonObj2.getMessage());
		
		//Demo of Prototype Scope...we will have 2 ref vars pointing to different 2 objects
		//this time the getBean() method will return each time a new Object
		HelloWorld prototypeObj1 = (HelloWorld) context.getBean("salutLume");
		prototypeObj1.setMessage("Salut Lume!");
		HelloWorld prototypeObj2 = (HelloWorld) context.getBean("salutLume");
	
		System.out.println(prototypeObj1.getMessage());
		System.out.println(prototypeObj2.getMessage());
	
	}
}
