package com.majina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commandeLigne")
public class CommandeLigne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCommandeLigne")
	private Integer idCommandeLigne;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@OneToOne
	@JoinColumn(name = "idCommande")
	private Commande commande;
	
	@OneToOne
	@JoinColumn(name = "idProduit")
	private Product product;

	public CommandeLigne() {
		super();
	}

	public CommandeLigne(Integer quantity, Commande commande, Product product) {
		super();
		this.quantity = quantity;
		this.commande = commande;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CommandeDetails [quantity=" + quantity + ", commande=" + commande + ", product=" + product + "]";
	}

}
