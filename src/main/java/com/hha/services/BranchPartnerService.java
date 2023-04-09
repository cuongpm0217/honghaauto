package com.hha.services;

import com.hha.entities.BranchPartner;

import java.util.List;

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
