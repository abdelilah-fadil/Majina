package com.majina.model;

import java.util.TimeZone;

public class City {

	private Integer idCity;
	private String city;
	private TimeZone timeZone;
	private State state;

	public City(Integer idCity, String city, TimeZone timeZone, State state) {
		super();
		this.idCity = idCity;
		this.city = city;
		this.timeZone = timeZone;
		this.state = state;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCity() {
		return idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", city=" + city + ", timeZone=" + timeZone + ", state=" + state + "]";
	}

}
