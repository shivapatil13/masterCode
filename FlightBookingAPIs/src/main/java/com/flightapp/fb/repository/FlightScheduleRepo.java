package com.flightapp.fb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.fb.entities.FlightScheduled;

@Repository
public interface FlightScheduleRepo extends JpaRepository<FlightScheduled, Integer> {

}
