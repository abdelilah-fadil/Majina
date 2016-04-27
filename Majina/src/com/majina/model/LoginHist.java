package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loginhist")
public class LoginHist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idLoginHist")
	private Integer idLoginHist;

	@Column(name = "dateLogin")
	private Date dateLogin;

	@Column(name = "IPAdress")
	private String IPAdress;

	@Column(name = "sessionDetail")
	private String sessionDetail;

	public LoginHist() {
	}

	public LoginHist(Integer idLoginHist, Date dateLogin, String iPAdress, String sessionDetail) {
		super();
		this.idLoginHist = idLoginHist;
		this.dateLogin = dateLogin;
		IPAdress = iPAdress;
		this.sessionDetail = sessionDetail;
	}

	public Integer getIdLogin() {
		return idLoginHist;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLoginHist = idLogin;
	}

	public Date getDateLogin() {
		return dateLogin;
	}

	public void setDateLogin(Date dateLogin) {
		this.dateLogin = dateLogin;
	}

	public String getIPAdress() {
		return IPAdress;
	}

	public void setIPAdress(String iPAdress) {
		IPAdress = iPAdress;
	}

	public String getSessionDetail() {
		return sessionDetail;
	}

	public void setSessionDetail(String sessionDetail) {
		this.sessionDetail = sessionDetail;
	}

	@Override
	public String toString() {
		return "LoginHist [idLogin=" + idLoginHist + ", dateLogin=" + dateLogin + ", IPAdress=" + IPAdress
				+ ", sessionDetail=" + sessionDetail + "]";
	}

}
