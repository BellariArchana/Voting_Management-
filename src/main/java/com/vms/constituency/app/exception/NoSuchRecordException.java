package com.vms.constituency.app.exception;

@SuppressWarnings("serial")
public class NoSuchRecordException extends RuntimeException {
	public NoSuchRecordException(String message) {
		super(message);
	}
}
