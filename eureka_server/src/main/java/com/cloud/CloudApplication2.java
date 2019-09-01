package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication2.class, args);
	}

}
