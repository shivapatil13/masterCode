package com.flightapp.fb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.fb.entities.FlightBook;

@Repository
public interface FlightBookRepo extends CrudRepository<FlightBook, Integer> {

}
