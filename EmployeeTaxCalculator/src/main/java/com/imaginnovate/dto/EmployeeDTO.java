package com.imaginnovate.dto;

import java.time.LocalDate;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeDTO {
	
	
	@NotNull(message = "firstName Must Not Be Null")
	@Size(min = 5,message = "FirstName Must Not Less Than 5 Characters")
	private String firstName;

	@NotNull(message = "lastName Must Not Be Null")
	@Size(min = 5,message = "LastName Must Not Less Than 5 Characters")
	private String lastName;

	@NotNull(message = "email Must Not Be Null")
	@Email
	private String email;

	@NotNull
	private Set<Long> phoneNumbers;

	@NotNull(message = "DOJ Must Not Be Null")
	@Past
	private LocalDate doj;
	
	@NotNull(message = "salary Must Not Be Null")
	private Double salary;


}