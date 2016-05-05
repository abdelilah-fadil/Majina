package com.majina.test;

import org.hibernate.Session;

import com.majina.model_.Admin;
import com.majina.model_.StoreManager;
import com.majina.model_.User;
import com.majina.util.HibernateUtil;

public class TestDAO {

	public static void main(String[] args) {
		// AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		// adminDAOImpl.createAdmin(new TestMapping());
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		session.save(new User());
		session.save(new Admin());
		session.save(new StoreManager());
		session.getTransaction().commit();
		System.out.println("test");

	}

}
