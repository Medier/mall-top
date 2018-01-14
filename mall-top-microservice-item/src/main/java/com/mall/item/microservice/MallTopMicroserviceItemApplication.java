package com.mall.item.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  //声明Eureka客户端，声明这是一个微服务,需要注册到服务注册中心,这个注解相当于是一个开关
@SpringBootApplication
public class MallTopMicroserviceItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallTopMicroserviceItemApplication.class, args);
	}
}
