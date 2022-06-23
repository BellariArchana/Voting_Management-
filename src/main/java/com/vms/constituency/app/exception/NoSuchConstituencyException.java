package com.vms.constituency.app.exception;

@SuppressWarnings("serial")
public class NoSuchConstituencyException extends RuntimeException {
	public NoSuchConstituencyException(String message) {
		super(message);
	}
}
