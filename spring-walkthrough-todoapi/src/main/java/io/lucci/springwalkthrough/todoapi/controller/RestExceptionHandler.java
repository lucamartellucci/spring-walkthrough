package io.lucci.springwalkthrough.todoapi.controller;

import java.lang.reflect.UndeclaredThrowableException;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler (value = { ResourceNotFoundException.class })
    @ResponseStatus (HttpStatus.NOT_FOUND)
    public void handleResourceNotFoundException( Exception ex, WebRequest request ) {
        
    }

    @ExceptionHandler (value = { Exception.class, UndeclaredThrowableException.class })
    @ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleInternalServerErrorExceptions( Exception ex, WebRequest request ) {
    	
    }

}