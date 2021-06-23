package com.flightapp.fb.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight_book")
public class FlightBook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	private Integer numberOfSeat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private PassengerDetails passengerDetails;
	private String optForMeal;
	private Integer seatNumbers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(Integer numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public PassengerDetails getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(PassengerDetails passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	public String getOptForMeal() {
		return optForMeal;
	}

	public void setOptForMeal(String optForMeal) {
		this.optForMeal = optForMeal;
	}

	public Integer getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(Integer seatNumbers) {
		this.seatNumbers = seatNumbers;
	}
}
