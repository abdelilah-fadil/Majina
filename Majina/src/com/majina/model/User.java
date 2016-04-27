package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private Integer idUser;

	@Column(name = "fisrtName", nullable = true)
	private String fisrtName;

	@Column(name = "middleName", nullable = true)
	private String middleName;

	@Column(name = "lastName", nullable = true)
	private String lastName;

	@Column(name = "birthday", nullable = true)
	private Date birthday;

	@Column(name = "sexe", nullable = true)
	private String sexe;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "pwd", nullable = true)
	private String pwd;

	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role defaultRole;

	@Column(name = "dateRegistration", nullable = true)
	private Date dateRegistration;

	@Column(name = "adress_1", nullable = true)
	private String adress_1;

	@Column(name = "adress_2", nullable = true)
	private String adress_2;

	@Column(name = "zipcode", nullable = true)
	private Integer zipcode;

	@Column(name = "telephoneFixe", nullable = true)
	private String telephoneFixe;

	@Column(name = "telephoneMobile", nullable = true)
	private String telephoneMobile;

	@Column(name = "city", nullable = true)
	private City city;

	@ManyToOne
	@JoinColumn(name = "idLanguage")
	private Language defaultLanguage;

	@OneToMany
	@JoinTable(name = "userFeedbacks", joinColumns = { @JoinColumn(name = "idUser") }, inverseJoinColumns = {
			@JoinColumn(name = "idFeedback") })
	private List<Feedback> feedbacks;
	@OneToMany
	@JoinTable(name = "userLoginHistories", joinColumns = { @JoinColumn(name = "idUser") }, inverseJoinColumns = {
			@JoinColumn(name = "idLoginHist") })
	private List<LoginHist> loginHistories;

	@OneToMany
	@JoinTable(name = "userResearchHistories", joinColumns = { @JoinColumn(name = "idUser") }, inverseJoinColumns = {
			@JoinColumn(name = "idResearch") })
	private List<UserResearch> researches;

	public User(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, Role defaultRole, Date dateRegistration, String adress_1, String adress_2,
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
		this.defaultRole = defaultRole;
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

	public Role getDefaultRole() {
		return defaultRole;
	}

	public void setDefaultRole(Role defaultRole) {
		this.defaultRole = defaultRole;
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
