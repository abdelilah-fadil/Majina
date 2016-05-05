package com.majina.model_;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "usertype", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private Integer idUser;
	
//	@Column(name = "userType")
//	private String userType;

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

	public User(Integer idUser,  String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile) {
		super();
		this.idUser = idUser;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.sexe = sexe;
		this.email = email;
		this.pwd = pwd;
		this.dateRegistration = dateRegistration;
		this.adress_1 = adress_1;
		this.adress_2 = adress_2;
		this.zipcode = zipcode;
		this.telephoneFixe = telephoneFixe;
		this.telephoneMobile = telephoneMobile;
	}

	public User() {
		super();
	}

	
}
