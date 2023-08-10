package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/aloneconfig.xml");

		Person person = context.getBean("person3", Person.class);

		System.out.println(person);
		//System.out.println(person.getFriends().getClass().getName());
		System.out.println("**********************");
		
		System.out.println(person.getFeestructure());

	}

}
