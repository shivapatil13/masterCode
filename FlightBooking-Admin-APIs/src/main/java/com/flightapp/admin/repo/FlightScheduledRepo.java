package com.flightapp.admin.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.admin.entities.ScheduledFlight;

@Repository
public interface FlightScheduledRepo extends JpaRepository<ScheduledFlight, BigInteger>{

}
