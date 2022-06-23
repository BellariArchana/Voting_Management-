package com.vms.constituency.app.globalexceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vms.constituency.app.exception.IdNotFoundException;
import com.vms.constituency.app.exceptionstatus.ErrorInfo;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler({ IdNotFoundException.class })
	public ErrorInfo handleException(IdNotFoundException ie, HttpServletRequest req) {
		return new ErrorInfo(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, ie.getMessage(), req.getRequestURI(),
				req.getMethod());
	}

}
