package com.majina.test;

import com.majina.dao.AdminDAOImpl;
import com.majina.model.Admin;

public class TestDAO {

	public static void main(String[] args) {
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		adminDAOImpl.createAdmin(new Admin());
		System.out.println("test");

	}

}
