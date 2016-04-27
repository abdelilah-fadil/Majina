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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProduit")
	private Integer idProduit;

	@Column(name = "dateEntrance")
	private Date dateEntrance;

	@Column(name = "designation")
	private String designation;

	@Column(name = "description")
	private String description;

	@Column(name = "preference")
	private String preference;
	// price TTC

	@Column(name = "price")
	private Float price;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "poids")
	private Float poids;

	@Column(name = "dateCrea")
	private Date dateCrea;

	@Column(name = "dateUp")
	private Date dateUp;

	@ManyToOne
	@JoinColumn(name = "idRole")
	private Store store;

	@ManyToOne
	@JoinColumn(name = "idRole")
	private Category catagory;

	@ManyToMany
	@JoinTable(name = "productTags", joinColumns = { @JoinColumn(name = "idProduit") }, inverseJoinColumns = {
			@JoinColumn(name = "idTag") })
	private List<Tag> tags;

	public Product() {
	}

	public Product(Integer idProduit, Date dateEntrance, String designation, String description, String preference,
			Float price, Integer stock, Float poids, Date dateCrea, Date dateUp, Store store, Category catagory,
			List<Tag> tags) {
		super();
		this.idProduit = idProduit;
		this.dateEntrance = dateEntrance;
		this.designation = designation;
		this.description = description;
		this.preference = preference;
		this.price = price;
		this.stock = stock;
		this.poids = poids;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.store = store;
		this.catagory = catagory;
		this.tags = tags;
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public Date getDateEntrance() {
		return dateEntrance;
	}

	public void setDateEntrance(Date dateEntrance) {
		this.dateEntrance = dateEntrance;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Category getCatagory() {
		return catagory;
	}

	public void setCatagories(Category catagory) {
		this.catagory = catagory;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Product [idProduit=" + idProduit + ", dateEntrance=" + dateEntrance + ", designation=" + designation
				+ ", description=" + description + ", preference=" + preference + ", price=" + price + ", stock="
				+ stock + ", poids=" + poids + ", dateCrea=" + dateCrea + ", dateUp=" + dateUp + ", store=" + store
				+ ", catagories=" + catagory + ", tags=" + tags + "]";
	}

}
