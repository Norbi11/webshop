package com.shop.webshop.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shop.webshop.database.WSDatabase;
import com.shop.webshop.dom.Users;

public class UsersDB implements IDatabaseHandler<Users>{

	private WSDatabase db;
	private Session session;
	private Transaction transaction;
	
	public UsersDB(){
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		transaction  = session.beginTransaction();
	}
	
	@Override
	public List<Users> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert(Users user) {
		session.save(user);
		transaction.commit();
	}

	@Override
	public void Update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		
	}

}
