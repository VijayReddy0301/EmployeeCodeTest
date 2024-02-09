package com.imaginnovate.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.dto.EmployeeDTO;
import com.imaginnovate.entity.Employee;
import com.imaginnovate.response.TaxDetails;
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

	@GetMapping("/taxDetails")
	public ResponseEntity<List<TaxDetails>> getEmployeesTaxDeduction() {

		List<Employee> employees = service.findAllEmployees();

		List<TaxDetails> list = new ArrayList<TaxDetails>();

		employees.forEach(employee -> {

			list.add(service.calculateEmployeeTax(employee.getEmployeeID()));
		});

		return new ResponseEntity<List<TaxDetails>>(list, HttpStatus.OK);
	}

}
