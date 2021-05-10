package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Employee emp1 = context.getBean("emp1", Employee.class);
		emp1.setFullName("Saikat Mondal");
		emp1.setSalary("150000");
		System.out.println(emp1);

		Employee emp2 = context.getBean("emp1", Employee.class);
		emp1.setFullName("Gopal Jashwal");
		emp1.setSalary("200000");
		System.out.println(emp2);

		Employee emp3 = context.getBean("emp1", Employee.class);
		emp1.setFullName("Pankaj Tripathi");
		emp1.setSalary("250000");
		System.out.println(emp3);

		((AbstractApplicationContext) context).close();
	}

}
