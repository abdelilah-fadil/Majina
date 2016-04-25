package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Category {
	private Integer idCategorie;
	private String categorie;
	private Date dateCrea;
	private Date dateUp;
	private Category categorieM;
	private List<Product> products;

	public Category(Integer idCategorie, String categorie, Date dateCrea, Date dateUp, Category categorieM,
			List<Product> products) {
		super();
		this.idCategorie = idCategorie;
		this.categorie = categorie;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.categorieM = categorieM;
		this.products = products;
	}

	public Category() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToOne
	@JoinColumn(name = "CATEGORIE_MERE")
	public Category getCategorieM() {
		return categorieM;
	}

	public void setCategorieM(Category categorieM) {
		this.categorieM = categorieM;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
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
