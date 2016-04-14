package com.majina.model;

import java.sql.Date;

public class ProductTag {

	private Tag tag;
	private Product product;
	private Date dateTag;

	public ProductTag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductTag(Tag tag, Product product, Date dateTag) {
		super();
		this.tag = tag;
		this.product = product;
		this.dateTag = dateTag;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getDateTag() {
		return dateTag;
	}

	public void setDateTag(Date dateTag) {
		this.dateTag = dateTag;
	}

	@Override
	public String toString() {
		return "ProductTag [tag=" + tag + ", product=" + product + ", dateTag=" + dateTag + "]";
	}

}
