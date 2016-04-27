package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tag")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idTag")
	private Integer idTag;
	
	@Column(name = "tag")
	private String tag;
	
	@Column(name = "dateCrea")
	private Date dateCrea;

	public Tag(Integer idTag, String tag, Date dateCrea) {
		super();
		this.idTag = idTag;
		this.tag = tag;
		this.dateCrea = dateCrea;
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

	@Override
	public String toString() {
		return "Tag [idTag=" + idTag + ", tag=" + tag + ", dateCrea=" + dateCrea + "]";
	}

}
