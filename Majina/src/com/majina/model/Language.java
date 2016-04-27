package com.majina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idLanguage")
	private Integer idLanguage;

	@Column(name = "language")
	private String language;

	@Column(name = "codeLanguage")
	private String codeLanguage;

	public Language() {
		super();
	}

	public Integer getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getCodeLanguage() {
		return codeLanguage;
	}

	public void setCodeLanguage(String codeLanguage) {
		this.codeLanguage = codeLanguage;
	}

	public Language(Integer idLanguage, String language, String codeLanguage) {
		super();
		this.idLanguage = idLanguage;
		this.language = language;
		this.codeLanguage = codeLanguage;
	}

	public Language(String language) {
		super();
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
