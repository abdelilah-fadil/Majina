package com.majina.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idGroup")
	private Integer idGroup;
	
	@Column(name = "groupName")
	private String groupName;
	
	@Column(name = "dateCrea")
	private Date dateCrea;
	
	@Column(name = "dateMaj")
	private Date dateMaj;
	
	@ManyToMany(mappedBy="groups")
	private List<Client> members;
	
	@Column(name = "IsAdmin")
	private Boolean IsAdmin;

	public Group() {
	}

	

	public Group(Integer idGroup, String groupName, Date dateCrea, Date dateUp, List<Client> members,
			Boolean isAdmin) {
		super();
		this.idGroup = idGroup;
		this.groupName = groupName;
		this.dateCrea = dateCrea;
		this.dateMaj = dateUp;
		this.members = members;
		IsAdmin = isAdmin;
	}



	public Integer getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(Integer idgroup) {
		this.idGroup = idgroup;
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
		return dateMaj;
	}

	public void setDateUp(Date dateUp) {
		this.dateMaj = dateUp;
	}

	public List<Client> getMembers() {
		return members;
	}

	public void setMembers(List<Client> members) {
		this.members = members;
	}

	public Boolean getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		IsAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "Group [idgroup=" + idGroup + ", groupName=" + groupName + ", dateCrea=" + dateCrea + ", dateUp="
				+ dateMaj + ", members=" + members + "]";
	}

}
