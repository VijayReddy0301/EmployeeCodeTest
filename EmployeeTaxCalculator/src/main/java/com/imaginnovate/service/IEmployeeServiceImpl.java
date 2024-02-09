package com.imaginnovate.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.dto.EmployeeDTO;
import com.imaginnovate.entity.Employee;
import com.imaginnovate.repository.IEmployeeRepository;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public String addEmployee(EmployeeDTO employeedto) {

		Employee employee = new Employee();

		BeanUtils.copyProperties(employeedto, employee);

		Employee saveEmployee = repo.save(employee);

		return String.format("Employed Saved With %d", saveEmployee.getEmployeeID());

	}

}
