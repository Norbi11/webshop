package com.shop.webshop.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.shop.webshop.database.HibernateUtils;

@Repository
@Scope(value="prototype")
public class DB<T> implements IDatabaseHandler<T>{

	private Session session;
	private Class<T> genericType;
	
	public DB(){
	}
	
	public void setGenericType(Class<T> genericType) {
		this.genericType = genericType;
	}
	
	private void createSession() {
	    session = HibernateUtils.getSessionfactory().getCurrentSession();
	    session.getTransaction().begin();
	}
	
	@Override
	public List<T> GetAll() {
		createSession();
		String hql = "from " + genericType.getName();
		Query<T> query = session.createQuery(hql,genericType);
		List<T> results = query.getResultList();
		session.getTransaction().commit();
		return results;
	}

	@Override
	public T GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert(T instance) {
		
	}

	@Override
	public void Update(T instance) {
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
