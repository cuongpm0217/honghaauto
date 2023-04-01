package com.hha.services;

import com.hha.entities.Permission;

import java.util.List;

public interface PermissionService {
	Permission create(Permission p);

	Permission update(long id, Permission p);

	void delete(long id);
	boolean hidden(long id);

	Permission getById(long id);

	List<Permission> getAll();
}
