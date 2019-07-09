package org.app;

import org.app.one.Customer;
import org.app.one.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStarter implements CommandLineRunner {
	
	@Autowired
	private Product p;
@Autowired
private Customer c;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(p);
		System.out.println(c);
		

	}
	void main(){
		
		SpringApplication.run(AppStarter.class );
	}

}
