package com.majina.dao;

import com.majina.model.Admin;

public interface AdminDAO {
	public int createAdmin(Admin admin);
	public Admin getAdmin(Integer Id);
	public int updateAdmin(Admin admin);
	public int deleteAdmin(Admin admin);
	public int getAllAdmins();

}
