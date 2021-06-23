package com.cts.fb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.fb.repository.FlightRepo;

@SpringBootTest
class FlightBookingApIsApplicationTests {
	@Autowired
	FlightRepo repository;
	
	@Test
	public void contextLoads() {
		Assertions.assertTrue(repository.findAll().size() ==0);
	}
}
