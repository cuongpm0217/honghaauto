package com.hha.services;

import java.util.List;

import com.hha.entities.Branch;

public interface BranchService {
	Branch createBranch(Branch branch);
	Branch updateBranch(long id,Branch branch);
	boolean deleteBranch(long id);
	Branch getBranchById(long id);
	List<Branch> getAllBranch();
}
