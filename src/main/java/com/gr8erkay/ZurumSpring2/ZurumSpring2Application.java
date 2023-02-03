package com.gr8erkay.ZurumSpring2;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

@Data
@SpringBootApplication
public class ZurumSpring2Application {
	// CRUD - JPA (JPA, Thymeleaf) - Deca Dashboard
	//Git using IntelliJ
	//Tables -- Mappings
	//Structure MVC
	// Discuss Spring/SpringBoot Core Concepts -- Annotations
	public static void main(String[] args) {

		SpringApplication.run(ZurumSpring2Application.class, args);

		//model
		//services
		//util
		//constants
		//exception
	}

//	@Bean
//	public String cookBeans() {
//		return "Sweet Beans";
//	}

}
