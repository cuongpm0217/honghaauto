package com.hha.services;

import java.util.List;

import com.hha.entities.BranchDep;

public interface BranchDepService {
	BranchDep createBranchDep(BranchDep branchDep);
	BranchDep updateBranchDep(long id,BranchDep branchDep);
	void deleteBranchDep(long id);
	boolean hiddenBranchDep(long id);
	BranchDep getBranchDepById(long id);
	List<BranchDep> getAllBranchDep();
	List<BranchDep> getAllBranchDepByDepId(long id);
	List<BranchDep> getAllBranchDepByBranchId(long id);
}
