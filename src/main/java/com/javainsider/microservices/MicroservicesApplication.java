package com.javainsider.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicesApplication extends SpringBootServletInitializer {

	/*
	 * user when run as JAR
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}
	/*
	 * user when run as WAR
	 * 
	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesApplication.class);
	}

}
