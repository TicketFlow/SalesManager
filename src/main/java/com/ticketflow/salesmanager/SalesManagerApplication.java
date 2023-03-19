package com.ticketflow.salesmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SalesManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesManagerApplication.class, args);
    }

}
