package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Seller extends User {

	private Integer idSeller;

	public Seller(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims, Integer idSeller) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		this.idSeller = idSeller;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		// TODO Auto-generated constructor stub
	}

	public Integer getIdSeller() {
		return idSeller;
	}

	public void setIdSeller(Integer idSeller) {
		this.idSeller = idSeller;
	}

	@Override
	public String toString() {
		return "Seller [idSeller=" + idSeller + "]";
	}

}
