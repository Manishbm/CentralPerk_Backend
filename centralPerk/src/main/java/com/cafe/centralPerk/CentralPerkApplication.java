package com.cafe.centralPerk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = { "com.centralperk.menu.drinks", "com.centralperk.menu.food",
		"com.centralperk.userservice" })
@ComponentScan(basePackages = "com.centralperk.menu.drinks")
@ComponentScan(basePackages = "com.centralperk.menu.food")
@ComponentScan(basePackages = "com.centralperk.userservice")
@ComponentScan(basePackages = "com.centralperk.security")
@ComponentScan("com.centralperk")
public class CentralPerkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralPerkApplication.class, args);
	}

}
