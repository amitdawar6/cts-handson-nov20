package com.spring.org;

import org.springframework.stereotype.Repository;

@Repository
public class DBConfig {
	private String dbName;
	private String dbPassword;

	@Override
	public String toString() {
		return "DBConfig [dbName=" + dbName + ", dbPassword=" + dbPassword + "]";
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public DBConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("DBNAME: AMIT");
	}

}
