package com.vms.constituency.app.exceptionstatus;

import org.springframework.http.HttpStatus;

public class SuccessInfo {
	private int httpCode;
	private HttpStatus status;
	private String message;
	private int constituencyId;

	public int getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(int constituencyId) {
		this.constituencyId = constituencyId;
	}

	public SuccessInfo(int httpCode, HttpStatus status, String message, int constituencyId) {
		super();
		this.httpCode = httpCode;
		this.status = status;
		this.message = message;
		this.constituencyId = constituencyId;
	}

	public SuccessInfo() {
	}

}
