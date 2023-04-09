package com.hha.services.impl;

import com.hha.entities.Department;
import com.hha.repository.DepartmentRepository;
import com.hha.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department createDepartment(Department d) {
        d.setEnable(true);
        return repo.save(d);
    }

    @Override
    public Department updateDepartment(long id, Department d) {
        Department dep = repo.findById(id).get();
        if (Objects.nonNull(id) || Objects.nonNull(d) || Objects.nonNull(dep)) {
            dep.setDepGenId(d.getDepGenId());
            dep.setDepName(d.getDepName());
            dep.setEnable(d.isEnable());
        }
        return repo.save(dep);
    }

    @Override
    public void deleteDepartment(long id) {
        repo.deleteById(id);
    }

    @Override
    public boolean hidden(long id) {
        Department dep = repo.findById(id).get();
        if (Objects.nonNull(id) || Objects.nonNull(dep)) {
            dep.setEnable(false);
            repo.save(dep);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Department getDepartmentById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Department> getAllDepartment() {
        return repo.findAll();
    }

}
