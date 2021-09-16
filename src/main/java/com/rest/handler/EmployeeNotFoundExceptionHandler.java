package com.rest.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rest.CustomeException.EmployeeNoFoundException;

@RestControllerAdvice
public class EmployeeNotFoundExceptionHandler {
	
	@ExceptionHandler(EmployeeNoFoundException.class)
	public ResponseEntity<String> handleremployee(EmployeeNoFoundException enfe){
		
		return new ResponseEntity<String> ("Employee Not Found ",HttpStatus.NOT_FOUND);
		
	}
	
	
	

}
