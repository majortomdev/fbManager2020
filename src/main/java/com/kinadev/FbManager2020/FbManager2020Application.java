package com.kinadev.FbManager2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kinadev.FbManager2020.controllers"})
public class FbManager2020Application {

	public static void main(String[] args) {
		SpringApplication.run(FbManager2020Application.class, args);
	}
	
	
//	@SuppressWarnings("deprecation")
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//	   return new WebMvcConfigurerAdapter() {
//	      @Override
//	      public void addCorsMappings(CorsRegistry registry) {
//	         registry.addMapping("/products").allowedOrigins("http://localhost:4200");
//	      }    
//	   };
//	}

}
