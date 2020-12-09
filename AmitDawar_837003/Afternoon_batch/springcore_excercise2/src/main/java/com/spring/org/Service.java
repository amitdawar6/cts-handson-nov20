package com.spring.org;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void serviceStore() {
		dao.store();
		System.out.println("store() from service");
	}
}
