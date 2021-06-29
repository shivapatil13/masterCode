package com.flightapp.admin.mailservices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "sendemail")
public class MailServiceProperties {
	public Map<String, String> flightAdminProp = new HashMap<>();

	public Map<String, String> getFlightAdminProp() {
		return flightAdminProp;
	}

	public void setFlightAdminProp(Map<String, String> flightAdminProp) {
		this.flightAdminProp = flightAdminProp;
	}

}
