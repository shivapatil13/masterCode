package com.flightapp.airport.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.airport.model.Airport;
import com.flightapp.airport.repo.AirportRepo;
import com.flightapp.exception.RecordAlreadyPresentException;
import com.flightapp.exception.RecordNotFoundException;

@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepo airportRepo;

	/*
	 * view all Airports
	 */
	@Override
	public Iterable<Airport> viewAllAirport() {
		return airportRepo.findAll();
	}

	/*
	 * view airport by airportCode
	 */
	@Override
	public Airport viewAirport(String airportCode) {
		Optional<Airport> findById = airportRepo.findById(airportCode);
		if (findById.isPresent()) {
			return findById.get();
		}

		// return new ResponseEntity<Airport>(airport, HttpStatus.OK)}
		else
			throw new RecordNotFoundException("Airport with airport code: " + airportCode + "not exists");
	}
	/*
	 * catch(RecordNotFoundException e) { return new
	 * ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND); } }
	 */

	/*
	 * add a airport
	 */
	@Override
	public ResponseEntity<?> addAirport(Airport airport) {
		Optional<Airport> findById = airportRepo.findById(airport.getAirportCode());
		try {
			if (!findById.isPresent()) {
				airportRepo.save(airport);
				return new ResponseEntity<Airport>(airport, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"Airport with code : " + airport.getAirportCode() + " already present");
		} catch (RecordAlreadyPresentException e) {
			return new ResponseEntity<Airport>(airport, HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * modify an Airport
	 */
	@Override
	public Airport modifyAirport(Airport airport) {
		Optional<Airport> findById = airportRepo.findById(airport.getAirportCode());
		if (findById.isPresent()) {
			airportRepo.save(airport);
		} else
			throw new RecordNotFoundException("Airport with code: " + airport.getAirportCode() + " not exists");
		return airport;
	}

	/*
	 * remove an airport
	 */
	@Override
	public String removeAirport(String airportCode) {
		Optional<Airport> findById = airportRepo.findById(airportCode);
		if (findById.isPresent()) {
			airportRepo.deleteById(airportCode);
			return "Airport removed";
		} else
			throw new RecordNotFoundException("Airport with code: " + airportCode + " not exists");

	}

}
