package com.imaginnovate.response;

import lombok.Data;

@Data
public class TaxDetails {

	private Integer employeeID;
	
	private String firstName;
	
	private String lastName;
	
	private Double yearlySalary;
	
	private Double taxAmount;
	
	private Double cessAmount;
	
}
