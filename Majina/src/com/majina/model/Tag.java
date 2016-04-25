package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Tag {

	private Integer idTag;
	private String tag;
	private Date dateCrea;
	private List<Product> products;

	public Tag(Integer idTag, String tag, Date dateCrea, List<Product> products) {
		super();
		this.idTag = idTag;
		this.tag = tag;
		this.dateCrea = dateCrea;
		this.products = products;
	}

	public Tag() {
		super();
	}

	public Integer getIdTag() {
		return idTag;
	}

	public void setIdTag(Integer idTag) {
		this.idTag = idTag;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Tag [idTag=" + idTag + ", tag=" + tag + ", dateCrea=" + dateCrea + "]";
	}

}
