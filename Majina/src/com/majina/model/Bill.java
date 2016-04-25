package com.majina.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Bill {

	private Integer idBill;
	private Date dateBill;
	private Float amount;
	private Commande commande;

	public Bill(Integer idBill, Date dateBill, Float amount, Commande commande) {
		super();
		this.idBill = idBill;
		this.dateBill = dateBill;
		this.amount = amount;
		this.commande = commande;
	}

	public Bill() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdBill() {
		return idBill;
	}

	public void setIdBill(Integer idBill) {
		this.idBill = idBill;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateBill() {
		return dateBill;
	}

	public void setDateBill(Date dateBill) {
		this.dateBill = dateBill;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	@OneToOne
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "Bill [idBill=" + idBill + ", dateBill=" + dateBill + ", amount=" + amount + "]";
	}

}
