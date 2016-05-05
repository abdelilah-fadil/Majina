package com.majina.model_;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin")
//@DiscriminatorValue("Admin")
@PrimaryKeyJoinColumn(name="idUser")
public class Admin extends User {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, dateRegistration, adress_1,
				adress_2, zipcode, telephoneFixe, telephoneMobile);
		// TODO Auto-generated constructor stub
	}
	
	
}
