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
		// checkPermission(module);
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
			mSelect.setPermissions(module.getPermissions());
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
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	// custom
//	private void checkPermission(Module module) {
//		List<Permission> permissions = module.getPermissions();
//		if(permissions==null||permissions.isEmpty()) {
//			List<Permission> allPermission = perRepo.findAll();
//			if(allPermission==null||allPermission.isEmpty()) {
//				Permission full = new Permission();
//				full.setAction(EPermission.PERMISSION_FULL);
//				perRepo.save(full);
//				Permission create = new Permission();
//				create.setAction(EPermission.PERMISSION_CREATE);
//				perRepo.save(create);
//				Permission update = new Permission();
//				update.setAction(EPermission.PERMISSION_UPDATE);
//				perRepo.save(update);
//				Permission delete = new Permission();
//				delete.setAction(EPermission.PERMISSION_DELETE);
//				perRepo.save(delete);
//				Permission view = new Permission();
//				view.setAction(EPermission.PERMISSION_VIEW);
//				perRepo.save(view);
//			}
//			if(allPermission!=null) {				
//				Permission full = perRepo.findByAction(EPermission.PERMISSION_FULL)
//						.orElseThrow(()->new RuntimeException("Permission Full is not found"));
//				permissions.add(full);
//				Permission create = perRepo.findByAction(EPermission.PERMISSION_CREATE)
//						.orElseThrow(()->new RuntimeException("Permission create is not found"));
//				permissions.add(create);
//				Permission update = perRepo.findByAction(EPermission.PERMISSION_UPDATE)
//						.orElseThrow(()->new RuntimeException("Permission update is not found"));
//				permissions.add(update);
//				Permission delete = perRepo.findByAction(EPermission.PERMISSION_DELETE)
//						.orElseThrow(()->new RuntimeException("Permission delete is not found"));
//				permissions.add(delete);
//				Permission view = perRepo.findByAction(EPermission.PERMISSION_VIEW)
//						.orElseThrow(()->new RuntimeException("Permission view is not found"));
//				permissions.add(view);
//			}
//		}
//		
//	}

}
