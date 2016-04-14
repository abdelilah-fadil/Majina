package com.majina.model;

public class Zone {

	private Integer idZone;
	private String zone;

	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zone(Integer idZone, String zone) {
		super();
		this.idZone = idZone;
		this.zone = zone;
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

	@Override
	public String toString() {
		return "Zone [idZone=" + idZone + ", zone=" + zone + "]";
	}

}
