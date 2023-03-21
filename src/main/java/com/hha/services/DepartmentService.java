package com.hha.services;

import java.util.List;

import com.hha.entities.Department;

public interface DepartmentService {
	Department createDepartment(Department d);
	Department updateDepartment(long id,Department d);
	boolean deleteDepartment(long id);
	Department getDepartmentById(long id);
	List<Department> getAllDepartment();
}
