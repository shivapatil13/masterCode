package com.flightapp.airport.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.airport.model.Airport;

@Repository
public interface AirportRepo extends JpaRepository<Airport, String> {

}
