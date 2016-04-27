package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idClaim")
	private Integer idClaim;
	
	@Column(name = "claim")
	private String claim;
	
	@Column(name = "dateClaim")
	private Date dateClaim;
	
	@Column(name = "reply")
	private String reply;

	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Product produit;

	public Claim() {
	}

	public Claim(Integer idClaim, String claim, Date dateClaim, String reply, Product produit) {
		this.idClaim = idClaim;
		this.claim = claim;
		this.dateClaim = dateClaim;
		this.reply = reply;
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

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Claim [idClaim=" + idClaim + ", claim=" + claim + ", dateClaim=" + dateClaim + ", reply=" + reply
				+ ", produit=" + produit + "]";
	}

}
