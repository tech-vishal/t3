package com.iss.t3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class T3Application {

	public static void main(String[] args) {
		SpringApplication.run(T3Application.class, args);
	}
}
