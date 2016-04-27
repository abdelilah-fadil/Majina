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
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCategorie")
	private Integer idCategorie;

	@Column(name = "categorie")
	private String categorie;

	@Column(name = "dateCrea")
	private Date dateCrea;

	@Column(name = "dateUp")
	private Date dateUp;

	@OneToOne
	@JoinColumn(name = "idCategorie")
	private Category categorieM;

	public Category(Integer idCategorie, String categorie, Date dateCrea, Date dateUp, Category categorieM) {
		super();
		this.idCategorie = idCategorie;
		this.categorie = categorie;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.categorieM = categorieM;
	}

	public Category() {
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

	public Category getCategorieM() {
		return categorieM;
	}

	public void setCategorieM(Category categorieM) {
		this.categorieM = categorieM;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", categorie=" + categorie + ", dateCrea=" + dateCrea
				+ ", dateUp=" + dateUp + ", categorieM=" + categorieM + "]";
	}

}
