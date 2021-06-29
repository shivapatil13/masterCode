package com.flightapp.fb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.exception.FlightBookingException;
import com.flightapp.fb.entities.FlightBook;
import com.flightapp.fb.entities.Flights;
import com.flightapp.fb.service.FlightBookingService;

@RestController
@RequestMapping(value = "/api/v1.0/flight")
public class FlightBookingController {

	@Autowired
	private FlightBookingService flightBookingService;

	@PostMapping(value = "/newFlight")
	public Flights saveFlight(@RequestBody Flights newFlight) throws FlightBookingException {
		Flights flightResponse = null;
		try {
			flightResponse = flightBookingService.addNewFlights(newFlight);
		} catch (Exception e) {
			throw new FlightBookingException();
		}
		return flightResponse;
	}

	@GetMapping(value = "/flightList")
	public List<Flights> getFlightList() throws FlightBookingException {
		List<Flights> flightList = null;
		flightList = flightBookingService.getFlightList();
		return flightList;
	}
	
	
	@GetMapping("/flights/{id}")
	public Flights getFlightById(@PathVariable Integer id) throws FlightBookingException {
		Flights flight = null;
		flight = flightBookingService.getFlightById(id);
		return flight;
	}
	@PutMapping("/updateFlight/{id}")
	public Flights updateFlight(@PathVariable Integer id, @RequestBody Flights flight) throws Exception {
		Flights flightRes;
		flightRes = flightBookingService.updateFlight(id, flight);
		return flightRes;
	}

	@DeleteMapping("/removeFlight/{id}")
	public void removeFlight(@PathVariable Integer id) throws Exception {
		flightBookingService.removeFlight(id);
	}

	@ResponseBody
	@GetMapping("/flightDetails/{flightDate}/{fromPlace}/{toPlace}")
	public Object getFlightDetails(@PathVariable String flightDate, @PathVariable String fromPlace,
			@PathVariable String toPlace) throws FlightBookingException {
		Object searchFlightResponse;
		searchFlightResponse = flightBookingService.searchFlight(flightDate, fromPlace, toPlace);
		return searchFlightResponse;
	}


	@PostMapping(value = "/flightBooking")
	public FlightBook flightBooking(@RequestBody FlightBook bookFlight) throws FlightBookingException {
		FlightBook bookingResponse;
		bookingResponse = flightBookingService.bookFlight(bookFlight);
		return bookingResponse;

	}
}
