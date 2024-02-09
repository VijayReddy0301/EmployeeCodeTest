package com.imaginnovate.service;

import java.util.List;

import com.imaginnovate.dto.EmployeeDTO;
import com.imaginnovate.entity.Employee;
import com.imaginnovate.response.TaxDetails;


public interface IEmployeeService {

	public String addEmployee(EmployeeDTO employee);
	
	public TaxDetails calculateEmployeeTax(Integer employeeId);
	
	public List<Employee> findAllEmployees();
	
}
