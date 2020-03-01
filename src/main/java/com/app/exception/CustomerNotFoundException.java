package com.app.exception;

/**
 * @author Kishor R
 *
 */
public class CustomerNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * @param exception
	 */
	public CustomerNotFoundException(String exception) {
		super(exception);
	}
}
