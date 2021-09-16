package com.rest.CustomeException;

public class EmployeeNoFoundException extends RuntimeException {
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  EmployeeNoFoundException() {
		 super();
	 }

	 public  EmployeeNoFoundException( String msg) {
		 
		 super(msg);
	 }

}
