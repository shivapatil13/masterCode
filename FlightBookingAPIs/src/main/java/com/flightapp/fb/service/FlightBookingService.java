package com.flightapp.fb.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.constant.FlightBookingConstant;
import com.flightapp.exception.FlightBookingException;
import com.flightapp.fb.entities.FlightBook;
import com.flightapp.fb.entities.Flights;
import com.flightapp.fb.repository.FlightBookRepo;
import com.flightapp.fb.repository.FlightRepo;

@Service
public class FlightBookingService {
	@Autowired
	private FlightRepo flightRepo;

	@Autowired
	private FlightBookRepo flightBookRepo;
	Logger log = LoggerFactory.getLogger(FlightBookingService.class);

	public Flights addNewFlights(Flights flight) throws FlightBookingException {
		Flights flights = null;
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_1);
		try {
			flights = flightRepo.save(flight);
			log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_2);
		} catch (Exception e) {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_3);
			throw new FlightBookingException();
		}

		return flights;
	}

	public List<Flights> getFlightList() throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_5);
		List<Flights> flightList = null;
		try {
			flightList = flightRepo.findAll();
			log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_6);
		} catch (Exception e) {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_7);
			throw new FlightBookingException();
		}
		return flightList;
	}

	public Flights getFlightById(Integer id) throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_8);
		Optional<Flights> optional = flightRepo.findById(id);
		if (optional.isPresent()) {
			log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_9);
			return optional.get();
		} else {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_10);
			throw new FlightBookingException();
		}

	}

	public Flights updateFlight(Integer id, Flights flights) throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_11);
		if (flightRepo.existsById(id)) {
			return flightRepo.save(flights);
		} else {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_12);
			throw new FlightBookingException();
		}
	}

	public void removeFlight(Integer id) throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_13);
		if (flightRepo.existsById(id)) {
			flightRepo.deleteById(id);
		} else {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_14);
			throw new FlightBookingException();
		}
	}

	public Object searchFlight(String flightDate, String fromPlace, String toPlace) throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_15);
		Object searchFlight = null;
		try {
			searchFlight = flightRepo.searchFlightRepo(flightDate, fromPlace, toPlace);
			log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_16);
		} catch (Exception e) {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_17);
			throw new FlightBookingException();
		}
		return searchFlight;
	}

	public FlightBook bookFlight(FlightBook bookFlight) throws FlightBookingException {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_21);
		FlightBook response = null;
		try {
			response = flightBookRepo.save(bookFlight);
			log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_22);
		} catch (Exception e) {
			log.error(FlightBookingConstant.LOG_FLIGHT_BOOKING_23);
			throw new FlightBookingException();
		}
		return response;
	}

}
