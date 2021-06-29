package com.flightapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flightapp.constant.FlightBookingAdminConstant;

public class FlightBookingAdminException extends Exception {
	Logger log = LoggerFactory.getLogger(FlightBookingAdminException.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightBookingAdminException() {
		//System.out.println(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_4);
		log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_4);
	}

	public FlightBookingAdminException(String msg) {
		//System.out.println(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_4);
		log.info(FlightBookingAdminConstant.LOG_FLIGHT_BOOKING_ADMIN_4);

	}

}
