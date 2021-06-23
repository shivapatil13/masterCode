package com.flightapp.fb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.fb.entities.FlightBook;

@Repository
public interface FlightBookRepo extends JpaRepository<FlightBook, Integer> {

}
