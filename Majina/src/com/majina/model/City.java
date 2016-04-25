package com.majina.model;

import java.util.List;
import java.util.TimeZone;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class City {

	private Integer idCity;
	private String city;
	private TimeZone timeZone;
	private Country country;
	private List<User> users;

	public City(Integer idCity, String city, TimeZone timeZone, Country country, List<User> users) {
		super();
		this.idCity = idCity;
		this.city = city;
		this.timeZone = timeZone;
		this.country = country;
		this.users = users;
	}

	public City() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@OneToMany
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", city=" + city + ", timeZone=" + timeZone + ", Country=" + country + "]";
	}

}
