package com.flightapp.swagger;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
	@Bean
	public Docket flightBookingSwagger() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.cts.fb"))

				.build().apiInfo(metadata());
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("Flight Booking API's").description("all the flight booking Apis ")
				.version("1.0.0").contact(new Contact("Shiv", "http://ourPortal.com", "shiv@gmail.com"))
				.license("Open Source").licenseUrl("licenseUrl").build();
	}

}
