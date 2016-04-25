package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Store {

	private Integer idStore;
	private String storeName;
	private Date dateCrea;
	private Date dateUp;
	private List<Seller> sellers;
	private List<Product> products;
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
