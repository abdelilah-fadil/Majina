package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Commande {

	private Integer idCommande;
	private Date dateCmd;
	private String status;
	private Client client;
	private Bill bill;
	private List<CommandeLigne> commandeLignes;

	public Commande() {
		super();
	}

	public Commande(Integer idCommande, Date dateCmd, String status, Client client, Bill bill,
			List<CommandeLigne> commandeLignes) {
		super();
		this.idCommande = idCommande;
		this.dateCmd = dateCmd;
		this.status = status;
		this.client = client;
		this.bill = bill;
		this.commandeLignes = commandeLignes;
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

	@OneToOne
	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@OneToMany
	public List<CommandeLigne> getCommandeLignes() {
		return commandeLignes;
	}

	public void setCommandeLignes(List<CommandeLigne> commandeLignes) {
		this.commandeLignes = commandeLignes;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCmd=" + dateCmd + ", status=" + status + ", client="
				+ client + "]";
	}

}
