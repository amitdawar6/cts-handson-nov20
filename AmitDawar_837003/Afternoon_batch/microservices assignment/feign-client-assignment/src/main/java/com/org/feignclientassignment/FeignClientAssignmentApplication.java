package com.org.feignclientassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientAssignmentApplication.class, args);
	}

}
