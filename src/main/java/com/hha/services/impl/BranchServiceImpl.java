package com.hha.services.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		if (Objects.nonNull(brc)) {
			brc.setCreateDate(branch.getCreateDate());
			brc.setGenId(branch.getGenId());
			brc.setId(branch.getId());
			brc.setLever(branch.getLever());
			brc.setModifyDate(branch.getModifyDate());
			brc.setName(branch.getName());
			brc.setUserCreate(branch.getUserCreate());
			brc.setUserModify(branch.getUserModify());
		}
		return brc;
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

}
