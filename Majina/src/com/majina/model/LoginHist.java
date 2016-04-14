package com.majina.model;

import java.sql.Date;

public class LoginHist {

	private Integer idLogin;
	private Date dateLogin;
	private String IPAdress;
	private String sessionDetail;

	public LoginHist() {
		super();
	}

	public LoginHist(Integer idLogin, Date dateLogin, String iPAdress, String sessionDetail) {
		super();
		this.idLogin = idLogin;
		this.dateLogin = dateLogin;
		IPAdress = iPAdress;
		this.sessionDetail = sessionDetail;
	}

	public Integer getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
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
		return "LoginHist [idLogin=" + idLogin + ", dateLogin=" + dateLogin + ", IPAdress=" + IPAdress
				+ ", sessionDetail=" + sessionDetail + "]";
	}

}
