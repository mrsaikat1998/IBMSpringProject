package com.ibm.SP11_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		DemoManager demoManager = context.getBean("demoManager", DemoManager.class);

		System.out.println(demoManager.getServiceName());

		((AbstractApplicationContext) context).close();
	}
}
