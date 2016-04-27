package com.majina.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "zone")
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idZone")
	private Integer idZone;
	
	@Column(name = "zone")
	private String zone;
	
	@OneToMany
	@JoinTable(name = "zoneCountries", joinColumns = { @JoinColumn(name = "idZone") }, inverseJoinColumns = {
			@JoinColumn(name = "idCountry") })
	private List<Country> countries;

	public Zone() {
		super();
	}

	public Zone(Integer idZone, String zone, List<Country> countries) {
		super();
		this.idZone = idZone;
		this.zone = zone;
		this.countries = countries;
	}

	public Integer getIdZone() {
		return idZone;
	}

	public void setIdZone(Integer idZone) {
		this.idZone = idZone;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Zone [idZone=" + idZone + ", zone=" + zone + "]";
	}

}
