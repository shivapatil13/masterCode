package com.flightapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
public class FlightBookingAdminApIsApplication implements CommandLineRunner {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingAdminApIsApplication.class, args);

	}

	@Autowired
	PasswordEncoder encoder;

	@Override
	public void run(String... args) throws Exception {
//		String encoded = encoder.encode("ihht@123#cts");
//		System.out.println(encoded);

		// $2a$10$WFyHAzzNnabWBuPvgb6AUuB0kwY4QX/SCU1VVidb6wt4QdVTSTaQW

		boolean matches = encoder.matches("password", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6");
		System.out.println(matches);
	}

}
