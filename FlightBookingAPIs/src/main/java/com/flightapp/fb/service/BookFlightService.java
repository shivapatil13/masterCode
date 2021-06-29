package com.flightapp.fb.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.flightapp.fb.entities.FlightBook;

public interface BookFlightService {
	public ResponseEntity<?> createBooking(FlightBook newBooking);

	public FlightBook updateBooking(FlightBook newBooking);

	public String deleteBooking(Integer bookingId);

	public List<FlightBook> displayAllBooking();

	//public FlightBook findBookingById(Integer bookingId);

}
