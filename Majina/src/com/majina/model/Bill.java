package com.majina.model;

import java.sql.Date;

public class Bill {

	private Integer idBill;
	private Date dateBill;
	private Float amount;

	public Bill(Integer idBill, Date dateBill, Float amount) {
		super();
		this.idBill = idBill;
		this.dateBill = dateBill;
		this.amount = amount;
	}

	public Bill() {
		super();
	}

	public Integer getIdBill() {
		return idBill;
	}

	public void setIdBill(Integer idBill) {
		this.idBill = idBill;
	}

	public Date getDateBill() {
		return dateBill;
	}

	public void setDateBill(Date dateBill) {
		this.dateBill = dateBill;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bill [idBill=" + idBill + ", dateBill=" + dateBill + ", amount=" + amount + "]";
	}

}
