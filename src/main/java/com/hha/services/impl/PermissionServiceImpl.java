package com.hha.services.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Permission;
import com.hha.repository.PermissionRepository;
import com.hha.services.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{
	@Autowired
	private PermissionRepository repo;
	@Override
	public Permission create(Permission p) {
		return repo.save(p);
	}

	@Override
	public Permission update(long id, Permission p) {
		Permission pSelect = repo.findById(id).get();
		if(Objects.nonNull(id)||p!=null||pSelect!=null) 
		{
			pSelect.setAction(p.getAction());			
		}
		return pSelect;
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);		
	}

	@Override
	public Permission getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Permission> getAll() {
		return repo.findAll();
	}

}
