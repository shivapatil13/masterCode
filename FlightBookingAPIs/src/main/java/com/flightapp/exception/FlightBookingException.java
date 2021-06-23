package com.flightapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flightapp.constant.FlightBookingConstant;

public class FlightBookingException extends Exception {
	Logger log = LoggerFactory.getLogger(FlightBookingException.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightBookingException() {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_4);

	}

	public FlightBookingException(String msg) {
		log.info(FlightBookingConstant.LOG_FLIGHT_BOOKING_4);
	}

}
