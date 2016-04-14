package com.majina.model;

import java.sql.Date;

public class Payement {
	private Date datePayement;
	private Commande commande;
	private Bill bill;

	public Payement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payement(Date datePayement, Commande commande, Bill bill) {
		super();
		this.datePayement = datePayement;
		this.commande = commande;
		this.bill = bill;
	}

	public Date getDatePayement() {
		return datePayement;
	}

	public void setDatePayement(Date datePayement) {
		this.datePayement = datePayement;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Payement [datePayement=" + datePayement + ", commande=" + commande + ", bill=" + bill + "]";
	}

}
