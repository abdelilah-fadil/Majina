package com.majina.model;

import java.sql.Date;

public class Feedback {

	private Integer idFeedback;
	private String feedback;
	private Date dateFeedback;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(Integer idFeedback, String feedback, Date dateFeedback) {
		super();
		this.idFeedback = idFeedback;
		this.feedback = feedback;
		this.dateFeedback = dateFeedback;
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

	@Override
	public String toString() {
		return "Feedback [idFeedback=" + idFeedback + ", feedback=" + feedback + ", dateFeedback=" + dateFeedback + "]";
	}

}
