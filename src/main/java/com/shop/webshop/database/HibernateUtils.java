package com.shop.webshop.database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			SessionFactory sessionFactory =  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();		
			return sessionFactory;
		} catch (Throwable ex) {
			
			System.err.println("Initial SessionFactory creation failed." +ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionfactory().close();
	}
	
}
