package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.BranchPartner;
import com.hha.repository.BranchPartnerRepository;
import com.hha.services.BranchPartnerService;

@Service
public class BranchPartnerServiceImpl implements BranchPartnerService {
	@Autowired
	private BranchPartnerRepository repo;

	@Override
	public BranchPartner createBranchPartner(BranchPartner branchPartner) {
		branchPartner.setEnable(true);
		return repo.save(branchPartner);
	}

	@Override
	public BranchPartner updateBranchPartner(long id, BranchPartner branchPartner) {
		if (branchPartner != null || repo.findById(id).isPresent()) {
			BranchPartner bpSelect = repo.findById(id).get();
			bpSelect.setBranchId(branchPartner.getBranchId());
			bpSelect.setEnable(branchPartner.isEnable());
			bpSelect.setPartnerId(branchPartner.getPartnerId());
			return repo.save(bpSelect);
		} else {
			return null;
		}

	}

	@Override
	public void deleteBranchPartner(long id) {
		repo.deleteById(id);

	}

	@Override
	public boolean hiddenBranchPartner(long id) {
		if (repo.findById(id).isPresent()) {
			BranchPartner bpSelect = repo.findById(id).get();
			bpSelect.setEnable(false);
			repo.save(bpSelect);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public BranchPartner getBranchPartnerById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<BranchPartner> getAllBranchPartner() {
		return repo.findAll();
	}

	@Override
	public List<BranchPartner> getAllByBranchId(long id) {
		return repo.getAllByBranchId(id);
	}

	@Override
	public List<BranchPartner> getAllByPartnerId(long id) {
		return repo.getAllByPartnerId(id);
	}

}
