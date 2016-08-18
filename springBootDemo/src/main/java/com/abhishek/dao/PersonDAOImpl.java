package com.abhishek.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhishek.domain.PersonEnity;

@Transactional
@Repository("personDao")
public class PersonDAOImpl  implements PersonDAO{

	
	@Autowired  
	SessionFactory sessionFactory;  
	  
	
	@Override
	public void save(PersonEnity p) {
		// TODO Auto-generated method stub
	Session session=	sessionFactory.getCurrentSession(); 
	session.save(p);
	}

}
