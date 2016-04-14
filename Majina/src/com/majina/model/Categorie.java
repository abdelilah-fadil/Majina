package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Categorie {
	private Integer idCategorie;
	private String categorie;
	private Date dateCrea;
	private Date dateUp;
	private Categorie categorieM;
	private List<Product> products;

	public Categorie(Integer idCategorie, String categorie, Date dateCrea, Date dateUp, Categorie categorieM,
			List<Product> products) {
		super();
		this.idCategorie = idCategorie;
		this.categorie = categorie;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.categorieM = categorieM;
		this.products = products;
	}

	public Categorie() {
		super();
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	public Date getDateUp() {
		return dateUp;
	}

	public void setDateUp(Date dateUp) {
		this.dateUp = dateUp;
	}

	public Categorie getCategorieM() {
		return categorieM;
	}

	public void setCategorieM(Categorie categorieM) {
		this.categorieM = categorieM;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", categorie=" + categorie + ", dateCrea=" + dateCrea
				+ ", dateUp=" + dateUp + ", categorieM=" + categorieM + ", products=" + products + "]";
	}

}
