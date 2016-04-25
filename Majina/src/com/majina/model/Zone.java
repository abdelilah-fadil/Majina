package com.majina.model;

import java.util.List;

public class Zone {

	private Integer idZone;
	private String zone;
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
