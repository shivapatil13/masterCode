package com.flightapp.fb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flights {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String flightDate;
	private String flightName;
	private Double flightPrice;
	private String fromPlace;
	private String toPlace;
	private String trip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Double getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(Double flightPrice) {
		this.flightPrice = flightPrice;
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

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	@Override
	public String toString() {
		return "Flights [id=" + id + ", flightDate=" + flightDate + ", flightName=" + flightName + ", flightPrice="
				+ flightPrice + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", trip=" + trip + "]";
	}

	public Flights(Integer id, String flightDate, String flightName, Double flightPrice, String fromPlace,
			String toPlace, String trip) {
		super();
		this.id = id;
		this.flightDate = flightDate;
		this.flightName = flightName;
		this.flightPrice = flightPrice;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.trip = trip;
	}

	public Flights() {

	}

}
