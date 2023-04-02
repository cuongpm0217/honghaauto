package com.hha.services.impl;

import com.hha.entities.Branch;
import com.hha.repository.BranchRepository;
import com.hha.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	private BranchRepository repo;

	@Override
	public Branch createBranch(Branch branch) {
		branch.setEnable(true);
		return repo.save(branch);
	}

	@Override
	public Branch updateBranch(long id, Branch branch) {
		Branch brc = repo.findById(id).get();
		if (Objects.nonNull(brc)||Objects.nonNull(branch)) {
			brc.setGenId(branch.getGenId());		
			brc.setLever(branch.getLever());			
			brc.setName(branch.getName());			
		}
		return repo.save(brc);
	}

	@Override
	public void deleteBranch(long id) {
		repo.deleteById(id);		
	}

	@Override
	public Branch getBranchById(long id) {
		Branch brc = repo.findById(id).get();
		return brc;
	}

	@Override
	public List<Branch> getAllBranch() {		
		return (List<Branch>)repo.findAll();
	}

	@Override
	public boolean hiddenBranch(long id) {
		Branch brc = repo.findById(id).get();
		if(brc!=null) {
			brc.setEnable(false);
			repo.save(brc);
			return true;
		}else {
			return false;
		}
		
	}

}
