package com.hha.services;

import java.util.List;

import com.hha.entities.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee emp);

	Employee updateEmployee(long id, Employee emp);

	void deleteEmployee(long id);

	void hidden(long id);

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployee();

	List<Employee> getEmployeeByText(String txtSearch);
}
