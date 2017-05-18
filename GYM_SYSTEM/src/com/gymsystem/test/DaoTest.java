package com.gymsystem.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gymsystem.po.User;

public class DaoTest extends HibernateDaoSupport{

	private SessionFactory sessionFactory;
	
	
	Configuration configuration = null;
//	SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session session = null;
	
	
	@Before
	public void setUp() throws Exception{
		configuration = new Configuration().configure();
		
//		sessionFactory = configuration.buildSessionFactory();
		
//		session = sessionFactory.openSession();
		
//		System.out.println("session    "+session);
		
	}
	
	
	@After
	public void tearDown() throws Exception{
//		if (session!= null||session.isOpen()) {
//			session.close();
//			System.out.println("session is close!");
//		}
	}
	
	
	@Test
	public void addUser(){
		
		User user  = new User("mike","123");
		
		this.getHibernateTemplate().save(user);
		
	}
	
}
