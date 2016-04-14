package com.majina.model;

import java.sql.Date;

public class Promote {

	private Date dateStart;
	private Date dateEnd;
	private Product product;
	private Promotion promotion;

	public Promote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promote(Date dateStart, Date dateEnd, Product product, Promotion promotion) {
		super();
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.product = product;
		this.promotion = promotion;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	@Override
	public String toString() {
		return "Promote [dateStart=" + dateStart + ", dateEnd=" + dateEnd + ", product=" + product + ", promotion="
				+ promotion + "]";
	}

}
