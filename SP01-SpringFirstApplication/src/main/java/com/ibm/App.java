package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		Employee employee = (Employee) context.getBean("emp1");
		
		System.out.println();
		System.out.println("By using toString");
		System.out.println(employee);
		System.out.println("By using display() method");
		employee.display();
		Address address1 = (Address) context.getBean("address1");

		System.out.println(address1);
		((ClassPathXmlApplicationContext) context).close();
	}

}
