package com.montrealcollege.exercise11.model;

import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
	private String firstName;
	private String lastName;
	private Integer Salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

}
