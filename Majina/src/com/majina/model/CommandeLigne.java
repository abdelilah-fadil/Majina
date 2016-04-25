package com.majina.model;

public class CommandeLigne {
	private Integer quantity;
	private Commande commande;
	private Product product;

	public CommandeLigne() {
		super();
		// TODO Auto-generated constructor stub
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
