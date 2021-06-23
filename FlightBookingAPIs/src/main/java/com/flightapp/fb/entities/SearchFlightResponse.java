package com.flightapp.fb.entities;

import lombok.Data;

@Data
public class SearchFlightResponse {

	private Integer id;
	private String flightDate;
	private String flightName;
	private Double flightPrice;

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

	@Override
	public String toString() {
		return "SearchFlightResponse [id=" + id + ", flightDate=" + flightDate + ", flightName=" + flightName
				+ ", flightPrice=" + flightPrice + "]";
	}

}
