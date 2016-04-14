package com.majina.model;

import java.sql.Date;

public class Shippment {

	private Date dateShippemnt;
	private Bill bill;
	private Shipper shipper;

	public Shippment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shippment(Date dateShippemnt, Bill bill, Shipper shipper) {
		super();
		this.dateShippemnt = dateShippemnt;
		this.bill = bill;
		this.shipper = shipper;
	}

	public Date getDateShippemnt() {
		return dateShippemnt;
	}

	public void setDateShippemnt(Date dateShippemnt) {
		this.dateShippemnt = dateShippemnt;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	@Override
	public String toString() {
		return "Shippment [dateShippemnt=" + dateShippemnt + ", bill=" + bill + ", shipper=" + shipper + "]";
	}

}
