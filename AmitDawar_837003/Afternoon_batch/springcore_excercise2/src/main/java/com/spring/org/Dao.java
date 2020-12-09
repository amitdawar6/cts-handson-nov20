package com.spring.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	@Autowired
	private DBConfig dbconfig;

	public void setDbconfig(DBConfig dbconfig) {
		this.dbconfig = dbconfig;
	}
	
	public void store() {
		System.out.println("store() from DAO");
	}
	
}
