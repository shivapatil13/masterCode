package com.cts.ag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class FlightBookingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingApiGatewayApplication.class, args);
	}

}
