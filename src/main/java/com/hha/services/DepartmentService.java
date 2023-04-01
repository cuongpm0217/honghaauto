package com.hha.services;

import com.hha.entities.Department;

import java.util.List;

public interface DepartmentService {
	Department createDepartment(Department d);

	Department updateDepartment(long id, Department d);

	void deleteDepartment(long id);

	boolean hidden(long id);

	Department getDepartmentById(long id);

	List<Department> getAllDepartment();
}
