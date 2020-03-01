package com.app.exception;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Kishor R
 *
 */
@ControllerAdvice
public class GlobalCustomExceptionHandle extends ResponseEntityExceptionHandler{
	
	// create logger object
	private static Logger log=Logger.getLogger(GlobalCustomExceptionHandle.class);
	
	/**
	 * @param response
	 * @throws IOException
	 */
	@ExceptionHandler(CustomerNotFoundException.class)
	public void handleException(HttpServletResponse response) throws IOException{
		// initializing logger 
		PropertyConfigurator.configure(System.getProperty("user.dir")+ File.separator + "log4j.properties");
		log.info("Exception Handling by Globaly");
		// send custom exception response
		response.sendError(HttpStatus.NOT_FOUND.value());
	}
}
