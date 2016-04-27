package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name="idAdmin", referencedColumnName="idUser")
public class Admin extends User {

	public Admin() {
	}

	public Admin(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday, String sexe,
			String email, String pwd, Role defaultRole, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, City city, Language defaultLanguage,
			List<Feedback> feedbacks, List<LoginHist> loginHistories, List<UserResearch> researches) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, defaultRole, dateRegistration,
				adress_1, adress_2, zipcode, telephoneFixe, telephoneMobile, city, defaultLanguage, feedbacks,
				loginHistories, researches);
	}

}
