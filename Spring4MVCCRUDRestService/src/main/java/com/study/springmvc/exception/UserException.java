package com.study.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Users are not found in the system.")
public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197716006127004354L;

}
