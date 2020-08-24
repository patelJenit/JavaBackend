package com.wemanager.Customermanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.DiscoveryClient;
import com.wemanager.Customermanagerservice.repository.UserRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class CustomerManagerServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
		
	public static void main(String[] args) {
		SpringApplication.run(CustomerManagerServiceApplication.class, args);
	}

}
