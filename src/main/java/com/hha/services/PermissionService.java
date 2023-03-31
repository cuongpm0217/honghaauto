package com.hha.services;

import java.util.List;

import com.hha.entities.Permission;

public interface PermissionService {
	Permission create(Permission p);

	Permission update(long id, Permission p);

	void delete(long id);

	Permission getById(long id);

	List<Permission> getAll();
}
