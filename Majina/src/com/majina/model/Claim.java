package com.majina.model;

import java.sql.Date;

public class Claim {
	private Integer idClaim;
	private String claim;
	private Date dateClaim;
	private String reply;
	private User user;
	private Product produit;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(Integer idClaim, String claim, Date dateClaim, String reply, User user, Product produit) {
		super();
		this.idClaim = idClaim;
		this.claim = claim;
		this.dateClaim = dateClaim;
		this.reply = reply;
		this.user = user;
		this.produit = produit;
	}

	public Integer getIdClaim() {
		return idClaim;
	}

	public void setIdClaim(Integer idClaim) {
		this.idClaim = idClaim;
	}

	public String getClaim() {
		return claim;
	}

	public void setClaim(String claim) {
		this.claim = claim;
	}

	public Date getDateClaim() {
		return dateClaim;
	}

	public void setDateClaim(Date dateClaim) {
		this.dateClaim = dateClaim;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Claim [idClaim=" + idClaim + ", claim=" + claim + ", dateClaim=" + dateClaim + ", reply=" + reply
				+ ", user=" + user + ", produit=" + produit + "]";
	}

}
