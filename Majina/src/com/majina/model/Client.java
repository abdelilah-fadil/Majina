package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Client extends User {

	private List<Commande> commandes;
	private List<Group> groups;
	private List<Claim> claims;

	public Client(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<UserResearch> researches) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, role, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks, loginHistories,
				researches);
	}

	public Client() {
		super();
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	@Override
	public String toString() {
		return "Client [commandes=" + commandes + ", groups=" + groups + "]";
	}

}
