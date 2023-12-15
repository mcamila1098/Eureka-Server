package com.example.videojuegoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VideojuegoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideojuegoEurekaServerApplication.class, args);
	}

}
