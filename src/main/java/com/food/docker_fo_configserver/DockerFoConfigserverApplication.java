package com.food.docker_fo_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DockerFoConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFoConfigserverApplication.class, args);
	}

}
