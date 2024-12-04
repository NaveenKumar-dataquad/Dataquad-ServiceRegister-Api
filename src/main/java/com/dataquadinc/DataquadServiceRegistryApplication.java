package com.dataquadinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DataquadServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataquadServiceRegistryApplication.class, args);
	}

}
