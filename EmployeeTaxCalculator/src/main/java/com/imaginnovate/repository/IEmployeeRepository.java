package com.imaginnovate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
