package com.hha.services;

import com.hha.entities.Branch;

import java.util.List;

public interface BranchService {
	Branch createBranch(Branch branch);
	Branch updateBranch(long id,Branch branch);
	void deleteBranch(long id);
	void hiddenBranch(long id);
	Branch getBranchById(long id);
	List<Branch> getAllBranch();
}
