package com.hha.services;

import com.hha.entities.Employee;

import java.util.List;

public interface EmployeeService {
	Employee createEmployee(Employee emp);

	Employee updateEmployee(long id, Employee emp);

	void deleteEmployee(long id);

	boolean hidden(long id);

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployee();

	List<Employee> getEmployeeByText(String txtSearch);
}
