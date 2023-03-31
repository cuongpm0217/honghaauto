package com.hha.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
import com.hha.repository.ModuleDetailRepository;
import com.hha.repository.ModuleRepository;
import com.hha.services.ModuleDetailService;

@Service
public class ModuleDetailServiceImpl implements ModuleDetailService {

	@Autowired
	private ModuleDetailRepository mdRepo;
	// @Autowired
	private ModuleRepository moduleRepo;

	@Override
	public ModuleDetail create(ModuleDetail md, long moduleId) {
//		Module m = moduleRepo.findById(moduleId).get();
//		if (m != null) {
			md.setModuleId(moduleId);
			md.setEnable(true);
			return mdRepo.save(md);
//		} else {
//			moduleRepo.findById(moduleId).orElseThrow(() -> new NullPointerException("Module NOT FOUND"));
//			return null;
//		}
	}

	@Override
	public ModuleDetail update(long moduleId, long id, ModuleDetail md) {
		Module m = moduleRepo.findById(moduleId).get();
		if (m != null || Objects.nonNull(moduleId)) {
			ModuleDetail mdSelect = mdRepo.findById(id).get();
			if (mdSelect != null || Objects.nonNull(id)) {
				mdSelect.setBranchId(md.getBranchId());
				mdSelect.setEnable(md.isEnable());
				mdSelect.setModifyDate(new Date());
				mdSelect.setModuleId(md.getModuleId());
				mdSelect.setName(md.getName());
				mdSelect.setUserModify(md.getUserModify());
				return mdRepo.save(mdSelect);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public void delete(long moduleId, long id) {
		Module m = moduleRepo.findById(moduleId).get();
		if (m != null || Objects.nonNull(moduleId) || Objects.nonNull(id)) {
			mdRepo.deleteById(id);
		}
	}

	@Override
	public boolean hidden(long moduleId, long id) {
		Boolean result = false;
		Module m = moduleRepo.findById(moduleId).get();
		if (m != null || Objects.nonNull(moduleId)) {
			ModuleDetail mdSelect = mdRepo.findById(id).get();
			if (mdSelect != null || Objects.nonNull(id)) {
				mdSelect.setEnable(false);
				mdRepo.save(mdSelect);
				result = true;
			}
		}
		return result;
	}

	@Override
	public ModuleDetail getById(long id) {
		return mdRepo.findById(id).get();
	}

	@Override
	public ModuleDetail getByName(long moduleId, String name) {
		if (Objects.isNull(moduleId) || name == null) {
			return null;
		} else {
			return mdRepo.findByName(moduleId, name).isPresent() ? 
					mdRepo.findByName(moduleId, name).get() : null;
		}
	}

	@Override
	public List<ModuleDetail> getAll() {
		return mdRepo.findAll();
	}

}
