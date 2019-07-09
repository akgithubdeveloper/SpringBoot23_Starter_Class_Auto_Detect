package org.app.config;

import org.app.one.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {

	@Bean
 public Customer custobj() {
		
		System.out.println("New Config Loaded");
		
		Customer c= new Customer();
		c.setCustId(10);
		return c;
	}
}
