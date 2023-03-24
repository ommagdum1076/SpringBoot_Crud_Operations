package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
public class SpringBootCrudAll1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAll1Application.class, args);
	}

}
