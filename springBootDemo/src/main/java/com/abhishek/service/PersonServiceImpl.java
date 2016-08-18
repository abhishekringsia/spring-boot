package com.abhishek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.dao.PersonDAO;
import com.abhishek.domain.PersonEnity;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO personDao;
	
	@Override
	public void addPerson(String personName) {
		// TODO Auto-generated method stub
		
		PersonEnity p = new PersonEnity();
		p.setName(personName);
		personDao.save(p);
	}

}
