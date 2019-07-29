package com.udemy.currencyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyEurekaNamingServerApplication.class, args);
	}

}
