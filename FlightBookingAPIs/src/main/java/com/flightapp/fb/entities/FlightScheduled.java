package com.flightapp.fb.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightScheduled {

	@Id
	private Integer flightNumber;
	private String flightName;
	private String fromPlace;
	private String toPlace;
	private String startDate;
	private String endDate;
	// private ScheduledDays scheduleddays;
	private Integer businessClassSeats;
	private Integer nonBusinessClassSeats;
	private Double ticketFare;
	private Integer numberOfRows;
	private String meals;

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setBusinessClassSeats(Integer businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}

	public Integer getNonBusinessClassSeats() {
		return nonBusinessClassSeats;
	}

	public void setNonBusinessClassSeats(Integer nonBusinessClassSeats) {
		this.nonBusinessClassSeats = nonBusinessClassSeats;
	}

	public Double getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(Double ticketFare) {
		this.ticketFare = ticketFare;
	}

	public Integer getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(Integer numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "FlightScheduled [flightNumber=" + flightNumber + ", flightName=" + flightName + ", fromPlace="
				+ fromPlace + ", toPlace=" + toPlace + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", businessClassSeats=" + businessClassSeats + ", nonBusinessClassSeats=" + nonBusinessClassSeats
				+ ", ticketFare=" + ticketFare + ", numberOfRows=" + numberOfRows + ", meals=" + meals + "]";
	}

}
