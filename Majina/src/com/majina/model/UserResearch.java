package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userresearch")
public class UserResearch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idResearch")
	private Integer idResearch;
	
	@Column(name = "researchValue")
	private String researchValue;
	
	@Column(name = "dateResearch")
	private Date dateResearch;

	public UserResearch() {
		super();
	}

	public UserResearch(Integer idResearch, String researchValue, Date dateResearch) {
		super();
		this.idResearch = idResearch;
		this.researchValue = researchValue;
		this.dateResearch = dateResearch;
	}

	public Integer getIdResearch() {
		return idResearch;
	}

	public void setIdResearch(Integer idResearch) {
		this.idResearch = idResearch;
	}

	public String getResearchValue() {
		return researchValue;
	}

	public void setResearchValue(String researchValue) {
		this.researchValue = researchValue;
	}

	public Date getDateResearch() {
		return dateResearch;
	}

	public void setDateResearch(Date dateResearch) {
		this.dateResearch = dateResearch;
	}


	@Override
	public String toString() {
		return "Research [idResearch=" + idResearch + ", researchValue=" + researchValue + ", dateResearch="
				+ dateResearch + "]";
	}

}
