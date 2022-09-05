package com.docker.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootDockerMavenApplication.main()");
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}

}
