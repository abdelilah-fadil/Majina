package com.majina.model;

public class Language {
	private Integer idLanguage;
	private String language;

	public Language() {
		super();
	}

	public Language(Integer idLanguage, String language) {
		super();
		this.idLanguage = idLanguage;
		this.language = language;
	}

	public Integer getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Language [idLanguage=" + idLanguage + ", language=" + language + "]";
	}

}
