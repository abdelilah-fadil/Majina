package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	private Integer idUser;
	private String fisrtName;
	private String middleName;
	private String lastName;
	private Date birthday;
	private String sexe;
	private String email;
	private String pwd;
	private String defaultRole;
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
	private List<UserResearch> researches;

	public User(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, String role, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<UserResearch> researches) {
		super();
		this.idUser = idUser;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.sexe = sexe;
		this.email = email;
		this.pwd = pwd;
		this.defaultRole = role;
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
	}

	public User() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
		return defaultRole;
	}

	public void setRole(String role) {
		this.defaultRole = role;
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

	@OneToMany
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@OneToOne
	public Language getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(Language defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	@OneToMany
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	@OneToMany
	public List<LoginHist> getLoginHistories() {
		return loginHistories;
	}

	public void setLoginHistories(List<LoginHist> loginHistories) {
		this.loginHistories = loginHistories;
	}

	@OneToMany
	public List<UserResearch> getResearches() {
		return researches;
	}

	public void setResearches(List<UserResearch> researches) {
		this.researches = researches;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", fisrtName=" + fisrtName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", birthday=" + birthday + ", sexe=" + sexe + ", email=" + email + ", pwd=" + pwd
				+ ", role=" + defaultRole + ", dateRegistration=" + dateRegistration + ", adress_1=" + adress_1
				+ ", adress_2=" + adress_2 + ", zipcode=" + zipcode + ", telephoneFixe=" + telephoneFixe
				+ ", telephoneMobile=" + telephoneMobile + ", city=" + city + ", defaultLanguage=" + defaultLanguage
				+ ", feedbacks=" + feedbacks + ", loginHistories=" + loginHistories + ", researches=" + researches
				+ "]";
	}

}
