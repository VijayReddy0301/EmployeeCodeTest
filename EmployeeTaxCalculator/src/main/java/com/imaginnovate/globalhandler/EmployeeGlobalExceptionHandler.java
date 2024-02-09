package com.imaginnovate.globalhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeGlobalExceptionHandler {

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleIllegalArgument(MethodArgumentNotValidException exception){
		
		Map<String,String> errorDetails = new HashMap<String, String>();
		
		exception.getBindingResult().getFieldErrors().forEach(error ->{
			
			errorDetails.put(error.getField(), error.getDefaultMessage());
			
		});;
		
		return new ResponseEntity<Map<String,String>>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
}
