package com.hha.services;

import java.util.List;

import com.hha.entities.BranchPartner;

public interface BranchPartnerService {
	BranchPartner createBranchPartner(BranchPartner branchPartner);

	BranchPartner updateBranchPartner(long id, BranchPartner branchPartner);

	void deleteBranchPartner(long id);

	boolean hiddenBranchPartner(long id);

	BranchPartner getBranchPartnerById(long id);

	List<BranchPartner> getAllBranchPartner();

	List<BranchPartner> getAllByBranchId(long id);

	List<BranchPartner> getAllByPartnerId(long id);
}
