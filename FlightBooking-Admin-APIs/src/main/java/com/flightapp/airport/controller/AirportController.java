package com.flightapp.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.airport.model.Airport;
import com.flightapp.airport.service.AirportService;

@RestController
@RequestMapping(value = "/api/v1.0/airport")
@CrossOrigin(origins = "http://localhost:4200/")
public class AirportController {

	@Autowired(required = true)
	AirportService airportService;

	@GetMapping("/viewAirport/{id}")
	public Airport viewAirport(@PathVariable("id") String airportCode) {
		return airportService.viewAirport(airportCode);
	}

	@GetMapping("/allAirport")
	public Iterable<Airport> viewAllAirport() {
		return airportService.viewAllAirport();
	}

	@PostMapping("/addAirport")
	public void addAirport(@RequestBody Airport airport) {
		airportService.addAirport(airport);
	}

	@PutMapping("/updateAirport")
	public void modifyAirport(@RequestBody Airport airport) {
		airportService.modifyAirport(airport);
	}

	@DeleteMapping("/deleteAirport/{id}")
	public void removeAirport(@PathVariable("id") String airportCode) {
		airportService.removeAirport(airportCode);
	}

}
