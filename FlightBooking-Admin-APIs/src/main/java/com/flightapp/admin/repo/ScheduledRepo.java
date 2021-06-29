package com.flightapp.admin.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.admin.entities.Schedule;
@Repository

public interface ScheduledRepo extends JpaRepository<Schedule, BigInteger>{

}
