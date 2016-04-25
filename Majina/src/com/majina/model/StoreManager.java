package com.majina.model;

import java.sql.Date;
import java.util.List;

public class StoreManager extends User {

	private String rib;
	private String codeSwift;
	private List<Store> stores;

	public StoreManager(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<UserResearch> researches) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches);
	}

	public StoreManager() {
		super();
	}

	public StoreManager(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<UserResearch> researches, String rib,
			String codeSwift, List<Store> stores) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches);
		this.rib = rib;
		this.codeSwift = codeSwift;
		this.stores = stores;
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

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	@Override
	public String toString() {
		return "StoreManager [rib=" + rib + ", codeSwift=" + codeSwift + ", stores=" + stores + "]";
	}

}
