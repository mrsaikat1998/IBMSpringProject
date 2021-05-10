package com.ibm.SP11_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "package com.ibm.SP11_Bean")
public class ApplicationConfiguration {

	@Bean(name = "demoManager")
	public DemoManager helloWorld() {
		return new DemoManager();
	}

}
