package com.majina.model;

import java.sql.Date;

public class TVA {
	private Integer idTVA;
	private Float TVA;
	private Date dateCrea;
	private Date dateUp;

	public TVA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TVA(Integer idTVA, Float tVA, Date dateCrea, Date dateUp) {
		super();
		this.idTVA = idTVA;
		TVA = tVA;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
	}

	public Integer getIdTVA() {
		return idTVA;
	}

	public void setIdTVA(Integer idTVA) {
		this.idTVA = idTVA;
	}

	public Float getTVA() {
		return TVA;
	}

	public void setTVA(Float tVA) {
		TVA = tVA;
	}

	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	public Date getDateUp() {
		return dateUp;
	}

	public void setDateUp(Date dateUp) {
		this.dateUp = dateUp;
	}

	@Override
	public String toString() {
		return "TVA [idTVA=" + idTVA + ", TVA=" + TVA + ", dateCrea=" + dateCrea + ", dateUp=" + dateUp + "]";
	}

}
