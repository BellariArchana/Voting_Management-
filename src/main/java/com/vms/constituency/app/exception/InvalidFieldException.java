package com.vms.constituency.app.exception;

@SuppressWarnings("serial")
public class InvalidFieldException extends RuntimeException {
	public InvalidFieldException(String message) {
		super(message);
	}
}
