package com.hha.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hha.entities.Module;
import com.hha.repository.ModuleRepository;
import com.hha.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	private ModuleRepository repo;

	@Override
	public Module create(Module module) {
		module.setEnable(true);
		
		return repo.save(module);
	}

	@Override
	public Module update(long id, Module module) {
		Module mSelect = repo.findById(id).get();
		if (Objects.nonNull(id) || Objects.nonNull(module) || Objects.nonNull(mSelect)) {
			mSelect.setBranchId(module.getBranchId());
			mSelect.setEnable(module.isEnable());
			mSelect.setModifyDate(new Date());
			mSelect.setName(module.getName());
			mSelect.setUserModify(module.getUserModify());
			repo.save(mSelect);
		}
		return mSelect;
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Module getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Module> getAll() {
		return repo.findAll();
	}

	@Override
	public boolean hidden(long id) {
		boolean result = false;
		Module mSelect = repo.findById(id).get();
		if (Objects.nonNull(id) || Objects.nonNull(mSelect)) {
			mSelect.setEnable(false);
			repo.save(mSelect);
			result = true;
		}
		return result;
	}

	@Override
	public Module getByName(String name) {		
		return repo.findByName(name).isPresent()? repo.findByName(name).get():null;
	}


}
