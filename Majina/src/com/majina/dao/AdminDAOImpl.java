package com.majina.dao;

import org.hibernate.Session;

import com.majina.model.Admin;
import com.majina.util.HibernateUtil;

public class AdminDAOImpl implements AdminDAO {
	
	private 	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	@Override
	public int createAdmin(Admin admin) {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(admin);
		try {
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public Admin getAdmin(Integer Id) {
//		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		Object object = session.get(Admin.class, Id);
		if (object == null)
			return null;
		session.getTransaction().commit();
		return (Admin) object;
	}

	@Override
	public int updateAdmin(Admin admin) {
//		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		session.update(admin);
		session.getTransaction().commit();
		return 1;
	}

	@Override
	public int deleteAdmin(Admin admin) {
//		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		Object object = session.get(Admin.class, admin.getIdUser());
		if (object == null)
			return -1;
		session.delete(object);
		session.getTransaction().commit();
		return 0;
	}

	@Override
	public int getAllAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

}
