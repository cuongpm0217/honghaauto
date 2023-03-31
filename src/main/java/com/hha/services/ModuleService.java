package com.hha.services;

import java.util.List;

import com.hha.entities.Module;

public interface ModuleService {
	Module create(Module m);

	Module update(long id, Module p);

	void delete(long id);

	boolean hidden(long id);

	Module getById(long id);

	Module getByName(String name);

	List<Module> getAll();
}
