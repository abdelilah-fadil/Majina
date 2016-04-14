package com.majina.model;

import java.sql.Date;

public class Tag {

	private Integer idTag;
	private String tag;
	private Date dateCrea;

	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tag(Integer idTag, String tag, Date dateCrea) {
		super();
		this.idTag = idTag;
		this.tag = tag;
		this.dateCrea = dateCrea;
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

	@Override
	public String toString() {
		return "Tag [idTag=" + idTag + ", tag=" + tag + ", dateCrea=" + dateCrea + "]";
	}

}
