package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Admin extends User {

	private Integer idAdmin;

	public Admin(Integer idAdmin) {
		super();
		this.idAdmin = idAdmin;
	}

	public Admin(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims, Integer idAdmin) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		this.idAdmin = idAdmin;
	}

	public Admin() {
		super();
	}

	public Integer getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + "]";
	}

}
