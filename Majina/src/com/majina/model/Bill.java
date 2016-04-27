package com.majina.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idBill")
	private Integer idBill;

	@Column(name = "dateBill", nullable = true)
	private Date dateBill;

	@Column(name = "amount", nullable = true)
	private Float amount;

	@OneToOne
	@JoinColumn(name = "idCommande")
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

	public Integer getIdBill() {
		return idBill;
	}

	public void setIdBill(Integer idBill) {
		this.idBill = idBill;
	}

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
