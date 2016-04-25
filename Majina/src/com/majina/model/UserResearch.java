package com.majina.model;

import java.sql.Date;

import javax.persistence.OneToMany;

public class UserResearch {

	private Integer idResearch;
	private String researchValue;
	private Date dateResearch;
	private User user;

	public UserResearch() {
		super();
	}

	public UserResearch(Integer idResearch, String researchValue, Date dateResearch, User user) {
		super();
		this.idResearch = idResearch;
		this.researchValue = researchValue;
		this.dateResearch = dateResearch;
		this.user = user;
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

	@OneToMany
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Research [idResearch=" + idResearch + ", researchValue=" + researchValue + ", dateResearch="
				+ dateResearch + ", user=" + user + "]";
	}

}
