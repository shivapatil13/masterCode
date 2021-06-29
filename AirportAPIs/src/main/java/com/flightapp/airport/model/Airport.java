package com.flightapp.airport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String airportCode;
	private String airportLocation;
	private String airportName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Airport() {
		super();
	}

	public Airport(Integer id, String airportCode, String airportLocation, String airportName) {
		super();
		this.id = id;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.airportName = airportName;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", airportCode=" + airportCode + ", airportLocation=" + airportLocation
				+ ", airportName=" + airportName + "]";
	}

}
