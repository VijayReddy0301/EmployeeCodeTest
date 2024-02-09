package com.imaginnovate.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.dto.EmployeeDTO;
import com.imaginnovate.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployee(@Valid @RequestBody EmployeeDTO employeeDto) {

		String msg = service.addEmployee(employeeDto);

		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

}