package com.majina.model;

public class Shipper {

	private Integer idShepper;
	private String shipperName;

	public Shipper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipper(Integer idShepper, String shipperName) {
		super();
		this.idShepper = idShepper;
		this.shipperName = shipperName;
	}

	public Integer getIdShepper() {
		return idShepper;
	}

	public void setIdShepper(Integer idShepper) {
		this.idShepper = idShepper;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	@Override
	public String toString() {
		return "Shipper [idShepper=" + idShepper + ", shipperName=" + shipperName + "]";
	}

}
