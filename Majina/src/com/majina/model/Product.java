package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Product {
	private Integer idProduit;
	private Date dateEntrance;
	private String designation;
	private String description;
	private String preference;
	// prix hors taxes
	private Float price;
	private Integer stock;
	private Float poids;
	private Date dateCrea;
	private Date dateUp;
	private Store store;
	private TVA tva;
	private List<Categorie> catagories;
	private List<Tag> tags;
	private List<Promotion> promotions;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer idProduit, Date dateEntrance, String designation, String description, String preference,
			Float price, Integer stock, Float poids, Date dateCrea, Date dateUp, Store store, TVA tva,
			List<Categorie> catagories, List<Tag> tags, List<Promotion> promotions) {
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
		this.tva = tva;
		this.catagories = catagories;
		this.tags = tags;
		this.promotions = promotions;
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

	public TVA getTva() {
		return tva;
	}

	public void setTva(TVA tva) {
		this.tva = tva;
	}

	public List<Categorie> getCatagories() {
		return catagories;
	}

	public void setCatagories(List<Categorie> catagories) {
		this.catagories = catagories;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	@Override
	public String toString() {
		return "Product [idProduit=" + idProduit + ", dateEntrance=" + dateEntrance + ", designation=" + designation
				+ ", description=" + description + ", preference=" + preference + ", price=" + price + ", stock="
				+ stock + ", poids=" + poids + ", dateCrea=" + dateCrea + ", dateUp=" + dateUp + ", store=" + store
				+ ", tva=" + tva + ", catagories=" + catagories + ", tags=" + tags + ", promotions=" + promotions + "]";
	}

}
