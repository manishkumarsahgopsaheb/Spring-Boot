package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Alien a = context.getBean(Alien.class);
//		a.setAid(10);
//		a.setAname("Manish");
//		a.setTech("Computer Science");
//		System.out.println(a.toString());
//
//
//		Alien a1 = context.getBean(Alien.class);
//		a1.setAid(10);
//		a1.setAname("Harshita");
//		a1.setTech("Bio");
//		System.out.println(a1.toString());

		a.show();


	}

}
