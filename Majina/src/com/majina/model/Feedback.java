package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idFeedback")
	private Integer idFeedback;

	@Column(name = "feedback")
	private String feedback;

	@Column(name = "dateFeedback")
	private Date dateFeedback;

	public Feedback() {
		super();
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
