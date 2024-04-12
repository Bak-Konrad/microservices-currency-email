package com.example.microservicescurrencyemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MicroservicesCurrencyEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCurrencyEmailApplication.class, args);
	}

}
