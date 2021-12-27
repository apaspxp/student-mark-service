package com.pxp.studentmarkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentMarkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMarkServiceApplication.class, args);
	}

}
