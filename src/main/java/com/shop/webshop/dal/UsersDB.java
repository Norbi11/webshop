package com.shop.webshop.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.shop.webshop.database.HibernateUtils;
import com.shop.webshop.dom.Users;

@Repository
public class UsersDB implements IDatabaseHandler<Users>{

	private SessionFactory sessionFactory;
	private Session session;
	
	public UsersDB(){
		createSession();
	}
	
	private void createSession() {
	    sessionFactory = HibernateUtils.getSessionfactory();
	    session = sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Users> GetAll() {
		session.getTransaction().begin();
		String hql = "from " + Users.class.getName();
		Query<Users> query = session.createQuery(hql,Users.class);
		List<Users> users = query.getResultList();
		session.getTransaction().commit();
		return users;
	}

	@Override
	public Users GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert(Users user) {
		
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
