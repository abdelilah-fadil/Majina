package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCommande")
	private Integer idCommande;

	@Column(name = "dateCmd", nullable = true)
	private Date dateCmd;

	@Column(name = "status", nullable = true)
	private String status;

	@OneToOne
	@JoinColumn(name = "idBill")
	private Bill bill;

	@OneToMany
	@JoinTable(name = "commandeLignes", joinColumns = { @JoinColumn(name = "idCommande") }, inverseJoinColumns = {
			@JoinColumn(name = "idCommandeLigne") })
	private List<CommandeLigne> commandeLignes;

	public Commande() {
		super();
	}

	public Commande(Integer idCommande, Date dateCmd, String status, Bill bill, List<CommandeLigne> commandeLignes) {
		super();
		this.idCommande = idCommande;
		this.dateCmd = dateCmd;
		this.status = status;
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
		return "Commande [idCommande=" + idCommande + ", dateCmd=" + dateCmd + ", status=" + status + "]";
	}

}
