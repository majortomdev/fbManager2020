package com.kinadev.FbManager2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kinadev.FbManager2020.controllers"})
public class FbManager2020Application {

	public static void main(String[] args) {
		SpringApplication.run(FbManager2020Application.class, args);
	}


}
