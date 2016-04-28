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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idStore")
	private Integer idStore;

	@Column(name = "storeName")
	private String storeName;

	@Column(name = "dateCrea")
	private Date dateCrea;

	@Column(name = "dateUp")
	private Date dateUp;

	@OneToMany
	@JoinTable(name = "storeSellers", joinColumns = { @JoinColumn(name = "idStore") }, inverseJoinColumns = {
			@JoinColumn(name = "idSeller") })
	private List<Seller> sellers;

	@OneToMany
	@JoinTable(name = "storeProducts", joinColumns = { @JoinColumn(name = "idStore") }, inverseJoinColumns = {
			@JoinColumn(name = "idProduit") })
	private List<Product> products;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	private StoreManager storeManager;

	public Store() {
		super();
	}

	public Store(Integer idStore, String storeName, Date dateCrea, Date dateUp, List<Seller> sellers,
			List<Product> products, StoreManager storeManager) {
		super();
		this.idStore = idStore;
		this.storeName = storeName;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.sellers = sellers;
		this.products = products;
		this.storeManager = storeManager;
	}

	public Integer getIdStore() {
		return idStore;
	}

	public void setIdStore(Integer idStore) {
		this.idStore = idStore;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public List<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public StoreManager getStoreManager() {
		return storeManager;
	}

	public void setStoreManager(StoreManager storeManager) {
		this.storeManager = storeManager;
	}

	@Override
	public String toString() {
		return "Store [idStore=" + idStore + ", storeName=" + storeName + ", dateCrea=" + dateCrea + ", dateUp="
				+ dateUp + ", sellers=" + sellers + ", products=" + products + ", storeManager=" + storeManager + "]";
	}

}
