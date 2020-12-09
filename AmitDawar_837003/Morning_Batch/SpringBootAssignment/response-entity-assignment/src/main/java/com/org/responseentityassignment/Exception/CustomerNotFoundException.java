package com.org.responseentityassignment.Exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {
		super("Customer Not found");
	}
	
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
	

}

