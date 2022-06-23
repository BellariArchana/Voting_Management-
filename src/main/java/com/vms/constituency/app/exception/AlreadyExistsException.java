package com.vms.constituency.app.exception;

@SuppressWarnings("serial")
public class AlreadyExistsException extends RuntimeException {
	public AlreadyExistsException(String message) {
		super(message);
	}
}
