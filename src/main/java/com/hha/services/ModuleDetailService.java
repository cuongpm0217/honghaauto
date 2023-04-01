package com.hha.services;

import com.hha.entities.ModuleDetail;

import java.util.List;

public interface ModuleDetailService {
	ModuleDetail create(ModuleDetail md, long moduleId);

	ModuleDetail update(long moduleId, long id, ModuleDetail md);

	void delete(long moduleId, long id);

	boolean hidden(long moduleId, long id);

	ModuleDetail getById(long id);

	ModuleDetail getByName(long moduleId, String name);

	List<ModuleDetail> getAll();

}
