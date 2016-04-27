package com.majina.model;

import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCity")
	private Integer idCity;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "timeZone")
	private TimeZone timeZone;
	
	@ManyToOne
	@JoinColumn(name = "idCountry")
	private Country country;

	public City(Integer idCity, String city, TimeZone timeZone, Country country) {
		super();
		this.idCity = idCity;
		this.city = city;
		this.timeZone = timeZone;
		this.country = country;
	}

	public City() {
		super();
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", city=" + city + ", timeZone=" + timeZone + ", Country=" + country + "]";
	}

}
