package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.BranchDep;
import com.hha.repository.BranchDepRepository;
import com.hha.services.BranchDepService;
@Service
public class BranchDepServiceImpl implements BranchDepService {
	@Autowired
	private BranchDepRepository bdRepo;

	@Override
	public BranchDep createBranchDep(BranchDep branchDep) {
		branchDep.setEnable(true);
		return bdRepo.save(branchDep);
	}

	@Override
	public BranchDep updateBranchDep(long id, BranchDep branchDep) {
		if (branchDep != null||bdRepo.findById(id).isPresent()) {
			BranchDep bdSelect = bdRepo.findById(id).get();
			bdSelect.setBranchId(branchDep.getBranchId());
			bdSelect.setDepId(branchDep.getDepId());
			bdSelect.setEnable(branchDep.isEnable());
			return bdRepo.save(bdSelect);
		} else {
			return null;
		}

	}

	@Override
	public void deleteBranchDep(long id) {
		bdRepo.deleteById(id);
	}

	@Override
	public boolean hiddenBranchDep(long id) {
		if (bdRepo.findById(id).isPresent()) {
			BranchDep bdSelect = bdRepo.findById(id).get();			
			bdSelect.setEnable(false);
			bdRepo.save(bdSelect);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public BranchDep getBranchDepById(long id) {
		return bdRepo.findById(id).get();
	}

	@Override
	public List<BranchDep> getAllBranchDep() {		
		return bdRepo.findAll();
	}

	@Override
	public List<BranchDep> getAllBranchDepByDepId(long id) {
		return bdRepo.findAllByDepId(id);
	}

	@Override
	public List<BranchDep> getAllBranchDepByBranchId(long id) {
		return bdRepo.findAllByBranchId(id);
	}

}
