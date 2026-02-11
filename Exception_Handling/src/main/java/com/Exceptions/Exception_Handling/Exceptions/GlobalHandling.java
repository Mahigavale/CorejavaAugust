package com.Exceptions.Exception_Handling.Exceptions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalHandling {

	
	

	@ExceptionHandler(DuplicateRequestException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateRequestException(DuplicateRequestException ex)
	{
		
		ErrorResponse er=new ErrorResponse();
		er.setMessage(ex.getMessage());
		er.setStatuscode(403);
		er.setTime(LocalDateTime.now());
		er.setTrace(ex.getStackTrace()[0].toString());
		
		;
//		   Arrays.asList(ex.getStackTrace())
//		  .stream()
//		  .limit(1)
//		  .map((i)->(i.toString()))
//		  .forEach((i)->{
//			  er.setTrace(i);
//		  });
//		
		return new  ResponseEntity<ErrorResponse>(er,HttpStatus.FORBIDDEN);
	}
	
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Map<String,String>> handleit(ConstraintViolationException ex)
	{
		
		Map<String, String> mp=new HashMap<String, String>();
		    ex.getConstraintViolations().stream()
		    
		    .forEach((i)->{
		    	mp.put(i.getPropertyPath().toString(), i.getMessage());
		    });
		   
		
		    
		    
		    return new ResponseEntity<Map<String,String>>(mp, HttpStatus.BAD_REQUEST);
		  
		   
	}

	@ExceptionHandler(NoDirectorException.class)
	public String handle(NoDirectorException ex)
	{
		return ex.getMessage();
	}
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> han(MethodArgumentNotValidException ex)
	{
		Map<String, String> mp=new HashMap<String, String>();
		
	 ex.getBindingResult().getFieldErrors().stream()
	 .peek((i)->{System.out.println("##############################");})
	 .forEach((i)->{
		 mp.put(i.getField(), i.getDefaultMessage());
	 });	
		return mp;
	}
	
}
