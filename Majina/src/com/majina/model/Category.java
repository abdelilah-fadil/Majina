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
	@Column(name = "idCategory")
	private Integer idCategory;

	@Column(name = "Category")
	private String Category;

	@Column(name = "dateCrea")
	private Date dateCrea;

	@Column(name = "dateUp")
	private Date dateUp;

	@OneToOne
	@JoinColumn(name = "idCategory")
	private Category CategoryM;

	public Category(Integer idCategory, String Category, Date dateCrea, Date dateUp, Category CategoryM) {
		super();
		this.idCategory = idCategory;
		this.Category = Category;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.CategoryM = CategoryM;
	}

	public Category() {
		super();
	}

	public Integer getidCategory() {
		return idCategory;
	}

	public void setidCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String Category) {
		this.Category = Category;
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

	public Category getCategoryM() {
		return CategoryM;
	}

	public void setCategoryM(Category CategoryM) {
		this.CategoryM = CategoryM;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", Category=" + Category + ", dateCrea=" + dateCrea
				+ ", dateUp=" + dateUp + ", CategoryM=" + CategoryM + "]";
	}

}
