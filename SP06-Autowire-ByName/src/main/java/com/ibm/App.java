package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Employee employee1 = context.getBean("emp", Employee.class);
		System.out.println(employee1);
	}
}
