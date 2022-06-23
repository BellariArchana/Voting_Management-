package com.vms.constituency.app.exception;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String string) {
		super(string);
	}

}