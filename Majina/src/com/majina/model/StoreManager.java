package com.majina.model;

import java.sql.Date;
import java.util.List;

public class StoreManager extends User {

	private Integer idManager;
	private String rib;
	private String codeSwift;

	public StoreManager(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims, Integer idManager, String rib, String codeSwift) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		this.idManager = idManager;
		this.rib = rib;
		this.codeSwift = codeSwift;
	}

	public StoreManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreManager(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches, medias, claims);
		// TODO Auto-generated constructor stub
	}

	public Integer getIdManager() {
		return idManager;
	}

	public void setIdManager(Integer idManager) {
		this.idManager = idManager;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getCodeSwift() {
		return codeSwift;
	}

	public void setCodeSwift(String codeSwift) {
		this.codeSwift = codeSwift;
	}

	@Override
	public String toString() {
		return "StoreManager [idManager=" + idManager + ", rib=" + rib + ", codeSwift=" + codeSwift + "]";
	}

}
