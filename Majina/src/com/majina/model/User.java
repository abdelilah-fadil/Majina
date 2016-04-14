package com.majina.model;

import java.sql.Date;
import java.util.List;

public class User {

	private Integer idUser;
	private String fisrtName;
	private String middleName;
	private String lastName;
	private Date birthday;
	private String sexe;
	private String email;
	private String pwd;
	private String role;
	private Date dateRegistration;
	private String adress_1;
	private String adress_2;
	private Integer zipcode;
	private String telephoneFixe;
	private String telephoneMobile;
	private City city;
	private Language defaultLanguage;
	private List<Feedback> feedbacks;
	private List<LoginHist> loginHistories;
	private List<Research> researches;
	private List<Media> medias;
	private List<Claim> claims;

	public User(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<Research> researches, List<Media> medias,
			List<Claim> claims) {
		super();
		this.idUser = idUser;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.sexe = sexe;
		this.email = email;
		this.pwd = pwd;
		this.role = role;
		this.dateRegistration = dateRegistration;
		this.adress_1 = adress_1;
		this.adress_2 = adress_2;
		this.zipcode = zipcode;
		this.telephoneFixe = telephoneFixe;
		this.telephoneMobile = telephoneMobile;
		this.city = city;
		this.defaultLanguage = defaultLanguage;
		this.feedbacks = feedbacks;
		this.loginHistories = loginHistories;
		this.researches = researches;
		this.medias = medias;
		this.claims = claims;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	public String getAdress_1() {
		return adress_1;
	}

	public void setAdress_1(String adress_1) {
		this.adress_1 = adress_1;
	}

	public String getAdress_2() {
		return adress_2;
	}

	public void setAdress_2(String adress_2) {
		this.adress_2 = adress_2;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getTelephoneFixe() {
		return telephoneFixe;
	}

	public void setTelephoneFixe(String telephoneFixe) {
		this.telephoneFixe = telephoneFixe;
	}

	public String getTelephoneMobile() {
		return telephoneMobile;
	}

	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Language getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(Language defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public List<LoginHist> getLoginHistories() {
		return loginHistories;
	}

	public void setLoginHistories(List<LoginHist> loginHistories) {
		this.loginHistories = loginHistories;
	}

	public List<Research> getResearches() {
		return researches;
	}

	public void setResearches(List<Research> researches) {
		this.researches = researches;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", fisrtName=" + fisrtName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", birthday=" + birthday + ", sexe=" + sexe + ", email=" + email + ", pwd=" + pwd
				+ ", role=" + role + ", dateRegistration=" + dateRegistration + ", adress_1=" + adress_1 + ", adress_2="
				+ adress_2 + ", zipcode=" + zipcode + ", telephoneFixe=" + telephoneFixe + ", telephoneMobile="
				+ telephoneMobile + ", city=" + city + ", defaultLanguage=" + defaultLanguage + ", feedbacks="
				+ feedbacks + ", loginHistories=" + loginHistories + ", researches=" + researches + ", medias=" + medias
				+ ", claims=" + claims + "]";
	}

}
