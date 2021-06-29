package com.flightapp.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.flightapp.exception.FlightBookingException;
import com.flightapp.fb.entities.Flights;
import com.flightapp.fb.repository.FlightRepo;
import com.flightapp.fb.service.FlightBookingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightBookigRepoTest {

	@Autowired
	FlightBookingService flightBookingService;

	@Autowired
	FlightRepo flightRepo;

	@Test
	public void TestFlightDetails() throws FlightBookingException {

		Mockito.when(flightRepo.findAll())
				.thenReturn(Arrays.asList(new Flights(1, "29-06-2021", "AirIndia", 2000.0, "Pune", "Mumbai", "Oneway")));
						
		List<Flights> flights = flightBookingService.getFlightList();
		Assertions.assertSame(1, flights.size());

	}

}
