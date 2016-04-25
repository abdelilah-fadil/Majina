package com.majina.model;

import java.util.List;

import javax.persistence.OneToOne;

public class Language {
	private String language;
	private List<User> users;

	public Language(String language, List<User> users) {
		super();
		this.language = language;
		this.users = users;
	}

	public Language() {
		super();
	}

	public Language( String language) {
		super();
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@OneToOne
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	

}
