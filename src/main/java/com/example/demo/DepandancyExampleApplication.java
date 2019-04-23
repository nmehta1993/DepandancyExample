package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepandancyExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DepandancyExampleApplication.class, args);
		
		Alien a1= context.getBean(Alien.class);
		a1.show();
		
	}

}
