package com.flightapp.admin.service;

import java.math.BigInteger;

import com.flightapp.admin.entities.ScheduledFlight;
import com.flightapp.exception.RecordNotFoundException;
import com.flightapp.exception.ScheduledFlightNotFoundException;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	// boolean cancelBookings(BigInteger flightId) throws RecordNotFoundException;


}
