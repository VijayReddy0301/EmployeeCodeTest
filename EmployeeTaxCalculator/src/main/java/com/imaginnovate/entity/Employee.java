package com.imaginnovate.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeID;

	private String firstName;

	private String lastName;

	private String email;

	private Set<Long> phoneNumbers;

	private LocalDate doj;

	private Double salary;

}
