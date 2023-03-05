package com.ticketflow.salesmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories
public class SalesManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesManagerApplication.class, args);
	}

}
