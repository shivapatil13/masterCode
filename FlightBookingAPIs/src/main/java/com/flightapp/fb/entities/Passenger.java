package com.flightapp.fb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pnrNumber;
	private String passengerName;
	private int passengerAge;
	private Integer passengerUIN;
	private Double luggage;

	public Integer getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public Integer getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(Integer passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}
}
