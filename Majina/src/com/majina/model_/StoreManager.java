package com.majina.model_;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "storemanager")
@PrimaryKeyJoinColumn(name = "idUser")
public class StoreManager extends User {

	@Column(name = "rib")
	private String rib;

	@Column(name = "codeSwift")
	private String codeSwift;

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

	public StoreManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreManager(Integer idUser, String fisrtName, String middleName, String lastName, Date birthday,
			String sexe, String email, String pwd, Date dateRegistration, String adress_1, String adress_2,
			Integer zipcode, String telephoneFixe, String telephoneMobile, String rib, String codeSwift) {
		super(idUser, fisrtName, middleName, lastName, birthday, sexe, email, pwd, dateRegistration, adress_1, adress_2,
				zipcode, telephoneFixe, telephoneMobile);
		this.rib = rib;
		this.codeSwift = codeSwift;
	}
	
}
