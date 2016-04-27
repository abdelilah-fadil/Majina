package com.majina.model;

import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCountry")
	private Integer idCountry;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "countryCode")
	private String countryCode;
	
	@Column(name = "currency")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name = "idZone")
	private Zone zone;

	public Country() {
		super();
	}

	public Country(Integer idCountry, String country, String countryCode, Currency currency, Zone zone) {
		super();
		this.idCountry = idCountry;
		this.country = country;
		this.countryCode = countryCode;
		this.currency = currency;
		this.zone = zone;
	}

	public Integer getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Country [idCountry=" + idCountry + ", country=" + country + ", countryCode=" + countryCode
				+ ", currency=" + currency + ", zone=" + zone + "]";
	}

}
