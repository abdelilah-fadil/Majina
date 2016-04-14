package com.majina.model;

import java.sql.Date;
import java.util.List;

public class Group {

	private Integer idGroupe;
	private String groupName;
	private Date dateCrea;
	private Date dateUp;
	private List<Client> members;
	private List<Client> groupAdmins;

	public Group() {
		super();
	}

	public Group(Integer idGroupe, String groupName, Date dateCrea, Date dateUp, List<Client> members,
			List<Client> groupAdmins) {
		super();
		this.idGroupe = idGroupe;
		this.groupName = groupName;
		this.dateCrea = dateCrea;
		this.dateUp = dateUp;
		this.members = members;
		this.groupAdmins = groupAdmins;
	}

	public Integer getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(Integer idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public List<Client> getMembers() {
		return members;
	}

	public void setMembers(List<Client> members) {
		this.members = members;
	}

	public List<Client> getGroupAdmins() {
		return groupAdmins;
	}

	public void setGroupAdmins(List<Client> groupAdmins) {
		this.groupAdmins = groupAdmins;
	}

	@Override
	public String toString() {
		return "Group [idGroupe=" + idGroupe + ", groupName=" + groupName + ", dateCrea=" + dateCrea + ", dateUp="
				+ dateUp + ", members=" + members + ", groupAdmins=" + groupAdmins + "]";
	}

}
