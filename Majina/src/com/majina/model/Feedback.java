package com.majina.model;

import java.sql.Date;

import javax.persistence.OneToMany;

public class Feedback {

	private Integer idFeedback;
	private String feedback;
	private Date dateFeedback;
	private User user;

	public Feedback() {
		super();
	}

	public Feedback(Integer idFeedback, String feedback, Date dateFeedback, User user) {
		super();
		this.idFeedback = idFeedback;
		this.feedback = feedback;
		this.dateFeedback = dateFeedback;
		this.user = user;
	}

	public Integer getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(Integer idFeedback) {
		this.idFeedback = idFeedback;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Date getDateFeedback() {
		return dateFeedback;
	}

	public void setDateFeedback(Date dateFeedback) {
		this.dateFeedback = dateFeedback;
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
		return "Feedback [idFeedback=" + idFeedback + ", feedback=" + feedback + ", dateFeedback=" + dateFeedback + "]";
	}

}
