package com.hha.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hha.dtos.BranchDTO;
import com.hha.entities.Branch;
import com.hha.repository.BranchRepository;
import com.hha.services.BranchService;
@Service
@Transactional
public class BranchServiceImpl implements BranchService {
	@Autowired
	private BranchRepository repo;
	
	@Override
	public Branch createBranch(Branch branch) {
		return repo.save(branch);
	}

	@Override
	public Branch updateBranch(long id, Branch branch) {
		Branch brc = repo.findById(id).get();
		
		return null;
	}

	@Override
	public boolean deleteBranch(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Branch getBranchById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		return null;
	}

}
