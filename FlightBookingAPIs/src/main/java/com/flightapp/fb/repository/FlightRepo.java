package com.flightapp.fb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightapp.fb.entities.Flights;

@Repository
public interface FlightRepo extends JpaRepository<Flights, Integer> {

	@Query(value = "SELECT fl.id, fl.flight_date, fl.flight_name, fl.flight_price from flights fl ", nativeQuery = true)
	Object searchFlightRepo(String flightDate, String fromPlace, String toPlace);

}
