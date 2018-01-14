package com.mall.item.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MallTopMicroserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallTopMicroserviceEurekaApplication.class, args);
	}
}
