package com.hha.services;

import java.util.List;

import com.hha.entities.Branch;

public interface BranchService {
	Branch createBranch(Branch branch);
	Branch updateBranch(long id,Branch branch);
	void deleteBranch(long id);
	void hiddenBranch(long id);
	Branch getBranchById(long id);
	List<Branch> getAllBranch();
}
