package com.majina.model;

import java.sql.Date;

public class Commande {

	private Integer idCommande;
	private Date dateCmd;
	private String status;
	private Client client;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Integer idCommande, Date dateCmd, String status, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCmd = dateCmd;
		this.status = status;
		this.client = client;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCmd=" + dateCmd + ", status=" + status + ", client="
				+ client + "]";
	}

}
