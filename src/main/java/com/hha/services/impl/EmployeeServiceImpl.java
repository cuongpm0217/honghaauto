package com.hha.services.impl;

import com.hha.entities.Employee;
import com.hha.repository.EmployeeRepository;
import com.hha.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repo;
	@Override
	public Employee createEmployee(Employee emp) {
		emp.setEnable(true);
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(long id, Employee emp) {
		Employee empSelect = repo.findById(id).get();
		if(Objects.nonNull(id)||Objects.nonNull(empSelect)||Objects.nonNull(emp)) {
			empSelect.setAdd1(emp.getAdd1());
			empSelect.setAdd2(emp.getAdd2());
			empSelect.setBankAcc1(emp.getBankAcc1());
			empSelect.setBankAcc2(emp.getBankAcc2());
			empSelect.setBranchId(emp.getBranchId());
			empSelect.setDepId(emp.getDepId());
			empSelect.setDOB(emp.getDOB());
			empSelect.setEnable(emp.isEnable());
			empSelect.setLever(emp.getLever());
			empSelect.setModifyDate(new Date());
			empSelect.setName(emp.getName());
			empSelect.setNationId(emp.getNationId());
			empSelect.setPosition(emp.getPosition());
			empSelect.setSalary(emp.getSalary());
			empSelect.setTel1(emp.getTel1());
			empSelect.setTel2(emp.getTel2());
			empSelect.setUserModify(emp.getUserModify());
		}
		return repo.save(empSelect);
	}

	@Override
	public void deleteEmployee(long id) {
		repo.deleteById(id);
	}

	@Override
	public void hidden(long id) {
		Employee emp = repo.findById(id).get();
		if(Objects.nonNull(id)||Objects.nonNull(emp)) {
			emp.setEnable(false);
			repo.save(emp);
		}
	}

	@Override
	public Employee getEmployeeById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public List<Employee> getEmployeeByText(String txtSearch) {
		// TODO Auto-generated method stub
		return null;
	}

}
