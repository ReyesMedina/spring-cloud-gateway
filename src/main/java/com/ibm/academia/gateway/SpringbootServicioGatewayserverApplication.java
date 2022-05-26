package com.ibm.academia.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioGatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioGatewayserverApplication.class, args);
	}

}
