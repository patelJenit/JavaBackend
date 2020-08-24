package com.wemanager.productmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerServiceApplication.class, args);
	}

}
