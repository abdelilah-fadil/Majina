package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Promotion {

	private Integer idPromotion;
	private String libPromo;
	private String codePromo;
	private Date dateCrea;
	private Date dateUp;
	private List<Product> products;

	public Promotion() {
		super();
	}

	public Promotion(Integer idPromotion, String libPromo, String codePromo, Date dateCrea, Date dateUp,
			List<Product> products) {
		super();
		this.idPromotion = idPromotion;
		this.libPromo = libPromo;
		this.codePromo = codePromo;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.products = products;
	}



	public Integer getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(Integer idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getLibPromo() {
		return libPromo;
	}

	public void setLibPromo(String libPromo) {
		this.libPromo = libPromo;
	}

	public String getCodePromo() {
		return codePromo;
	}

	public void setCodePromo(String codePromo) {
		this.codePromo = codePromo;
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
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", libPromo=" + libPromo + ", codePromo=" + codePromo
				+ ", dateCrea=" + dateCrea + ", dateUp=" + dateUp + "]";
	}

}
