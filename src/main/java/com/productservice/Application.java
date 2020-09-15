package com.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main class to bootstrap the sprint application
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.productservice.*"})
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class,args);

	}

}
