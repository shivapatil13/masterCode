package com.flightapp.fb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.exception.RecordAlreadyPresentException;
import com.flightapp.exception.RecordNotFoundException;
import com.flightapp.fb.entities.FlightBook;
import com.flightapp.fb.repository.FlightBookRepo;

@Service
public class BookFlightServiceImpl implements BookFlightService {

	@Autowired
	private FlightBookRepo flightBookRepo;

	/*
	 * new Flight Booking
	 */
	@Override
	public ResponseEntity<?> createBooking(FlightBook newBooking) {
		Optional<FlightBook> findBookingById = flightBookRepo.findById(newBooking.getBookingId());
		try {
			if (!findBookingById.isPresent()) {
				flightBookRepo.save(newBooking);
				return new ResponseEntity<FlightBook>(newBooking, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"Booking with Booking Id: " + newBooking.getBookingId() + " already exists!!");
		} catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public FlightBook updateBooking(FlightBook changedBooking) {
		Optional<FlightBook> findBookingById = flightBookRepo.findById(changedBooking.getBookingId());
		if (findBookingById.isPresent()) {
			flightBookRepo.save(changedBooking);
		} else
			throw new RecordNotFoundException(
					"Booking with Booking Id: " + changedBooking.getBookingId() + " not exists!!");
		return changedBooking;
	}

	@Override
	public String deleteBooking(Integer bookingId) {

		Optional<FlightBook> findBookingById = flightBookRepo.findById(bookingId);
		if (findBookingById.isPresent()) {
			flightBookRepo.deleteById(bookingId);
			return "Booking Deleted!!";
		} else
			throw new RecordNotFoundException("Booking not found for the entered BookingID");
	}

	@Override
	public List<FlightBook> displayAllBooking() {
		List<FlightBook> listOfFlightBooking;
		listOfFlightBooking = (List<FlightBook>) flightBookRepo.findAll();
		return listOfFlightBooking;
	}

	/*
	 * @Override public FlightBook findBookingById(Integer bookingId) { FlightBook
	 * flightBook; flightBook = flightBookRepo.findById(bookingId); return
	 * flightBook; }
	 */

}
