package com.majina.test;

import java.util.Date;

import com.majina.dao.AdminDAOImpl;
import com.majina.model.Admin;

public class TestDAO {

	public static void main(String[] args) {
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		adminDAOImpl.createAdmin(new Admin());
		
		Date date = new Date();
		System.out.println(date);
		

	}

}
