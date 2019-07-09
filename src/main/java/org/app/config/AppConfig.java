package org.app.config;

import org.app.one.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
@Bean
public Product pobj() {
	
	System.out.println("AppConfig Loaded");
	Product p= new Product();
	p.setProdId(10);
	return p;
	
}
}
