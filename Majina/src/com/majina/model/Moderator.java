package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Moderator extends User {

	private Integer idModerator;

	public Moderator(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims, Integer idModerator) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		this.idModerator = idModerator;
	}

	public Moderator() {
		super();
	}

	public Moderator(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
	}

	public Integer getIdModerator() {
		return idModerator;
	}

	public void setIdModerator(Integer idModerator) {
		this.idModerator = idModerator;
	}

	@Override
	public String toString() {
		return "Moderator [idModerator=" + idModerator + "]";
	}

}
