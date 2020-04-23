package com.cts.feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FeedbackEureakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackEureakaServerApplication.class, args);
	}

}
