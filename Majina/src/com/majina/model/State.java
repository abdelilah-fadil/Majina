package com.majina.model;

public class State {

	private Integer idState;
	private String State;
	private Country country;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(Integer idState, String state, Country country) {
		super();
		this.idState = idState;
		State = state;
		this.country = country;
	}

	public Integer getIdState() {
		return idState;
	}

	public void setIdState(Integer idState) {
		this.idState = idState;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [idState=" + idState + ", State=" + State + ", country=" + country + "]";
	}

}
